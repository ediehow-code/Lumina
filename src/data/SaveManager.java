package data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SaveManager {
    // Lưu vào AppData hoặc User Home để cố định đường dẫn, không bao giờ rơi vào src
    private static final String DIR = System.getProperty("user.home") + File.separator + ".lumina_saves" + File.separator;

    public static boolean save(SaveData data, int slot) {
        try {
            File dir = new File(DIR);
            if (!dir.exists()) dir.mkdirs();

            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(DIR + "slot" + slot + ".dat"))) {
                oos.writeObject(data);
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static SaveData load(int slot) {
        File file = new File(DIR + "slot" + slot + ".dat");
        if (!file.exists()) return null;

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return (SaveData) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static boolean hasSave(int slot) {
        return new File(DIR + "slot" + slot + ".dat").exists();
    }
}