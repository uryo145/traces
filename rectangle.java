class Rectangle {
    int width;
    int height;
    void setSize(int w, int h) {
	width = w;
	height = h;
    }
    int getArea() {
	return width * height;
    }
}

public static voie main(String[] args) {
    Rectangle r = new Rectangle();
    r.setSize(123,45);

    System.out.println("幅は" + r.width);
    Sytem.out.println("高さは" + r.height);
}
