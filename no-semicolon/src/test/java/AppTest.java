import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.Test;

public class AppTest {

    @Test
    public void trueTest() throws IOException, InterruptedException {
        String javaHome = System.getProperty("java.home");
        System.out.println("javaH:" + javaHome);
        // String command = javaHome + "/bin/java -version";
        String command = javaHome + "/bin/java";
        String cp = "-cp";
        String cpV = "./target/classes";
        String cc = "App";
        ProcessBuilder processBuilder = new ProcessBuilder(command, cp, cpV, cc);
        processBuilder.redirectInput(Redirect.PIPE);
        processBuilder.redirectError(Redirect.PIPE);
        processBuilder.redirectOutput(Redirect.PIPE);

        Process process = processBuilder.start();

        System.out.println("Started process");

        String result = new String(process.getInputStream().readAllBytes());

        int waitFor = process.waitFor();
        
        System.out.println("Done waiting for process; exit code is " + waitFor + " and result is " + result);

        assertThat(result, is(";"));
    }

    @Test
    public void testNoSemicolon() throws IOException {
        String readString = Files.readString(Paths.get("./src/main/java/App.java"));
        assertThat(readString.contains(";"), is(false));
    }
}
