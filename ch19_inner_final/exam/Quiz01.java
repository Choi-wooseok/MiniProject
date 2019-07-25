package ch19_inner_final.exam;

interface View{
	interface onClickListener{
		public void onClick();

	}
}

class Button {
	public void setOnClickListener(View.onClickListener click) {
		click.onClick();
	}
}

public class Quiz01 {
	public static void main(String[] args) {
		Button b = new Button();
		// 클릭됨 을 출력
//		b.setOnClickListener(click);
		b.setOnClickListener(new View.onClickListener() {
			public void onClick() {
				System.out.println("클릭됨");
			}
		});
		
		
		
		
		
		
		
		
		
	}
}
