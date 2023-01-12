require 'open-uri'
require 'rb-fsevent'
require 'yaml'

# chargement config
config = YAML.load_file('config.yml')
password = config['password']

# Var video
youtube_url = config['youtube_url']

# ouvrir un stream stream
video_stream = open(youtube_url)

# On ouvre la vidéo 

fsevent = FSEvent.new
fsevent.watch video_stream do
  puts "Attention un babouin !"

  system("afplay", video_stream.path)


# Mot de passe ?
  puts "Quel est le mot sacré ?"
  entered_password = gets.chomp

  # comparer mdp
  if entered_password == password
    # arrêt du loop
    fsevent.stop
    puts "Les singes ont été calmés "
  else
    puts "OUH OUH OUH OUH OUH ESSSAIE ENCORE."
  end
end

# loop
fsevent.run
end

