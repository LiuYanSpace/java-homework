package TankGame02;

/**
 * @Auther:ZhengLiuYan
 * @Date: 2021/12/28 - 12 - 28 - 15:43
 * @Description:
 * @version:1.0
 */
@SuppressWarnings({"all"})
public class Tank {
    private int x;
    private int y;
    private int direction;//把坦克的方向当成一个变量
    private int speed = 1;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    //上右左下移动方法
    public void moveUp(){
        y -= speed;
    }
    public void moveRight(){
        x += speed;
    }
    public void moveDown(){
        y += speed;
    }
    public void moveLeft(){
        x -= speed;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

