import java.io.File
import java.io.IOException
import javax.sound.sampled.AudioSystem
import javax.sound.sampled.Clip

fun main() {
    val url = "https://www.youtube.com/watch?v=wYewE8kWuxw"
    val son = "monkey_sound.wav"
    val command = "youtube-dl -f bestaudio --extract-audio --audio-format wav -o $son $url"
    ProcessBuilder("bash", "-c", command).start().waitFor()
    val bruitsdesinges = File(son)
    val audioIn = AudioSystem.getAudioInputStream(bruitsdesinges)
    val clip = AudioSystem.getClip()
    clip.open(audioIn)
    clip.loop(Clip.LOOP_CONTINUOUSLY)
    println("OUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUH")
    val input = readLine()
    if(input == "OUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOU"){
        clip.stop()
        audioIn.close()
    }
}