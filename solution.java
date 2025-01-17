import java.io.*;
import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int k = Integer.parseInt(br.readLine());
		
		//동서남북 배열 정의
		ArrayList<Integer> east = new ArrayList<>();
		ArrayList<Integer> west = new ArrayList<>();
		ArrayList<Integer> south = new ArrayList<>();
		ArrayList<Integer> north = new ArrayList<>();
		
		// 입력 받기
		String[] input = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int length = Integer.parseInt(input[1]);
		
		// 입력 받은 만큼 숫자에 맞는 배열에 추가
		switch(n) {
			case 1:
				east.add(length);
				break;
			case 2:
				west.add(length);
				break;
			case 3:
				south.add(length);
				break;
			case 4:
				north.add(length);
				break;
		}
		
		
		int[] lengths = new int[4];
		
		// 동서남북 배열에 추가하는 메서드
		compass(lengths, east);
		compass(lengths, west);
		compass(lengths, south);
		compass(lengths, north);
		
		for(int i=0;i<lengths.length;i++) {
			if(i==0 || i==1) {
				
			}
			
		}
		
		
        bw.flush();
        br.close();
        bw.close();
	}
	
	public static void compass(int[] lengths, ArrayList<Integer> arr){
		for(int num : arr) {
			int sum =0;
			sum += num;
			lengths[0] = sum;
		}
	}
}
