import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DataBaseLec02 {

	public static void main(String[] args) throws IOException {
		File file = new File("ex_lec02_input.txt");
		File file2 = new File("ex_lec02_output.txt");
		
		if(!file2.exists()) {
			file.createNewFile();
		}
		
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			FileWriter fw = new FileWriter(file2);
			BufferedWriter writer = new BufferedWriter(fw);
			String line = "";
			
			while((line = br.readLine()) != null) {
				String[] str = line.split(",");
				if(str[2].equals(" 대한미디어") == false) {
					writer.write(line+"\n");
				}
			}
			writer.close();
			System.out.println("파일이 생성되었습니다.");
			
		}catch(FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
		}
	}
}
