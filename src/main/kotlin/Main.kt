import java.io.BufferedInputStream
import java.io.FileInputStream


fun main() {
    var running = true
    val reader = BufferedInputStream(FileInputStream(System.getProperty("user.home") + "/.steam/steam/logs/shader_log.txt"))

    var content = ""

    while (running) {
        if (reader.available() > 0) {
            content += reader.read().toChar()
        } else {
            try {
                println(content.substring(content.lastIndexOf("(") + 1, content.lastIndexOf(")")))
                Thread.sleep(10000)
            } catch (ex: InterruptedException) {
                running = false
            }
        }
    }
}