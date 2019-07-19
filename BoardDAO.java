/**
 * Data 의 처리 클래스
 * 
 * CRUD -> 
 * Create : insert + 기능
 * Read   : select + 기능 / 전체, selectOne + 기능 / 하나
 * Update : update + 기능
 * Delete : delete + 기능
 */

package practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class BoardDAO {
	
	BoardArrayList list = new BoardArrayList();
	//new BoardDAO(); 할때 호출되는 메서드
	BoardDAO(){
		File f = new File("src/ch11_datastruct/board/board.txt");
		try {
			Scanner sc = new Scanner(f);
			
			while(sc.hasNextLine()) {
				Board b = new Board();
				
				String line = sc.nextLine();
				String[] arr = line.split(":");
				b.setNo(Integer.parseInt(arr[0]));
				b.setTitle(arr[1]);
				b.setContent(arr[2]);
				b.setWriter(arr[3]);
				b.setRegDate(arr[4]);
				list.add(b);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
//		list.add();
		//board.txt파일의 내용을 읽어서 elements 배열에 등록하는 기능
		//board.txt파일을 읽어서 list에 데이터를 add하는 작업 진행
	}
	
	// 게시물
		// ---------------------------
		Board[] boardArr = new Board[10];
		// 게시물 위치 정보
		int boardPos = 0;
		int boardNo = 0;
		// ---------------------------
		
		Board[] selectBoard() {
			return Arrays.copyOf( boardArr, boardPos);
		}
		Board selectOneBoard(int no) {
			for (int i = 0; i < boardPos; i++) {
				Board b = boardArr[i];
				
				if (b.getNo() != no) continue;
				return b;
			}
			return null;
		}
		void insertBoard(Board board) {
			//공간이 다 찼다면 크기를 늘려서 사용한다.
			if (boardArr.length == boardPos) { 
				Arrays.copyOf(boardArr,boardPos*2); // 공간을 2배로 증가
			}
			// 게시물 번호
			if (board.getNo() == 0) {
			board.setNo(++boardNo);
			}
			
			// 게시글 개수 올리기 : 데이터저장 처리 이후에는 1씩 증가시키기
			boardArr[boardPos++] = board;
		}
		void updateBoard(Board board) {
			for (int i = 0; i < boardPos; i++) {
				Board b = boardArr[i];
				
				if (b.getNo() != board.getNo()) continue;
				
				b.setTitle(board.getTitle());
				b.setContent(board.getContent());
				return;
			}
		}
		int deleteBoard(int no) {
			for (int i = 0; i < boardPos; i++) {
				Board b = boardArr[i];
				if(b.getNo() != no) continue;
				for(int j = i; j < boardPos; j++) {
				
				System.arraycopy(boardArr, j + 1, boardArr, j, 1);
				}
				boardArr[--boardPos] = null;
				return 1;
		}
		return 0;
		}
		
		
}
