package ch19_inner_final;

//class R{
//	static Layout Layout;
//	static Drawable Drawable;
//	static Strings Strings;
//}
//
//class Layout {
//	public static final int main_layout = 0x0001;
//	public static final int sub_layout = 0x0002;
//}
//class Drawable {
//	public static final String img1 = "a.png";
//	public static final String img2 = "b.png";
//}
//class Strings {
//	public static final String hello = "안녕하세요";
//	public static final String title = "내부클래스 테스트중..";
//}

class R{
	static class Layout {
		public static final int main_layout = 0x0001;
		public static final int sub_layout = 0x0002;
	}
	static class Drawable {
		public static final String img1 = "a.png";
		public static final String img2 = "b.png";
	}
	static class Strings {
		public static final String hello = "안녕하세요";
		public static final String title = "내부클래스 테스트중..";
	}
}


public class Test04 {
	public static void main(String[] args) {
		System.out.println(R.Drawable.img1);
		System.out.println(R.Strings.title);
		System.out.println(R.Layout.main_layout);
	}
}

















