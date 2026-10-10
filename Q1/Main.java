import java.util.Scanner;

class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

public class Main {
    public static void shiftAll(Point[] pts, int dx, int dy) {
        for (int i = 0; i < pts.length; i++) {
            if (pts[i] != null) {
                pts[i].x += dx;
                pts[i].y += dy;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Point[] pts = new Point[n];
        for (int i = 0; i < n; i++) {
            String tok = in.next();
            if (!tok.equals("null")) {
                pts[i] = new Point(Integer.parseInt(tok), in.nextInt());
            }
        }
        int dx = in.nextInt();
        int dy = in.nextInt();
        shiftAll(pts, dx, dy);
        for (Point p : pts) {
            System.out.println(p);
        }
    }
}
