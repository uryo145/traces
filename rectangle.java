class Rectangle {
    int width;
    int height;

    //constructor
    Rectangle(int w, int h) {
	width = w;
	height = h;
    }

    //constructor with no arguments
    Rectangle() {
	setSize(10,20);
    }

    void setSize(int w, int h) {
	width = w;
	height = h;
    }

    int getArea() {
	return width * height;
    }
}

public static voie main(String[] args) {
    Rectangle r = new Rectangle(123,45);

    System.out.println("幅は" + r.width);
    Sytem.out.println("高さは" + r.height);
}
