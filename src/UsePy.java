import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UsePy {
    public static void main(String[] args) {
        //参数是一个日期，用来确认需要拿哪一天的期权
        String[] arguments = new String[] {"python", "src\\testMock.py","2020-09-16"};
        try {
            Process process = Runtime.getRuntime().exec(arguments);//调用python
            BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream(),"GBK"));
            //数据都在in里面
            String line = null;
            while ((line = in.readLine()) != null) {
                //TODO 后续操作 line就是json字符串

                System.out.println(line);
            }
            in.close();
            //java代码中的process.waitFor()返回值为0表示我们调用python脚本成功，
            //返回值为1表示调用python脚本失败，这和我们通常意义上见到的0与1定义正好相反
//            int re = process.waitFor();
//            System.out.println(re);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
