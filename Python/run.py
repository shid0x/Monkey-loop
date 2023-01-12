import os
import vlc

# Variables
password = "OUHOUHOUHOUHOUHOUH"
youtube_url = "<https://www.youtube.com/watch?v=wYewE8kWuxw&t=1s>"

# VLC player
Instance = vlc.Instance()
player = Instance.media_player_new()
Media = Instance.media_new(youtube_url)
Media.get_mrl()
player.set_media(Media)

#loop & pass

player.play()

while True:
    entered_password = input("OUH OUH OUH ?:")
    if entered_password == password:
        player.stop()
        print("OUH !.")
        break
    else:
        print("Incorrect password.")