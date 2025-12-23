import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configloader {
    private Properties properties;

    public Configloader(String filepath)  {
       // loadproperities(filepath);

    }

    private void loadproperities(String filepath) throws IOException {
        properties=new Properties();
        FileInputStream fileInputStream=new FileInputStream(filepath);
        try {
            properties.load(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public String getProperties(String Key) {
        return properties.getProperty(Key);
    }
}
