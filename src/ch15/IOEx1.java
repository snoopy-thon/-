package ch15;
import java.io.*;
import java.util.Arrays;
// 바이트기반 스트림
// 예제 15-1
public class IOEx1 {
    public static void main(String[] args) {
        byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
        byte[] outSrc = null;

        ByteArrayInputStream input = null;
        ByteArrayOutputStream output = null;

        input = new ByteArrayInputStream(inSrc);
        output = new ByteArrayOutputStream();

        int data = 0;

        while((data = input.read()) != -1){ // 더 이상 읽어 올 데이터가 없을 때까지 1byte씩 읽어오기
            output.write(data); // 읽어온 데이터를 출력소스에 쓰기
        }

        outSrc = output.toByteArray();    // 스트림 내용을 byte 배열로 반환한다.

        System.out.println("Input Source :" + Arrays.toString(inSrc));
        System.out.println("Output Source :" + Arrays.toString(outSrc));
    }
}

