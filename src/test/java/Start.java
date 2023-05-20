import net.minecraft.client.main.Main;
import net.minecraft.util.StatCollector;

import java.io.File;
import java.util.Arrays;

public class Start {
    /*
    this is basically the same as MavenMCP here https://github.com/Marcelektro/MavenMCP-1.8.9 but for gradle instead
     */
    public static void main(String[] args) {
        // Provide natives
        // Currently supported Linux and Windows
        System.setProperty("org.lwjgl.librarypath", new File("../natives/" + (System.getProperty("os.name").startsWith("Windows") ? "windows" : "linux")).getAbsolutePath());

        Main.main(concat(new String[]{"--version", "GradleMCP", "--accessToken", "0", "--assetsDir", "assets", "--assetIndex", "1.8", "--userProperties", "{}"}, args));
    }

    public static <T> T[] concat(T[] first, T[] second) {
        T[] result = Arrays.copyOf(first, first.length + second.length);
        System.arraycopy(second, 0, result, first.length, second.length);
        return result;
    }
}
