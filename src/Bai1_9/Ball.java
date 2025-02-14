package Bai1_9;

public class Ball {

        private float x;
        private float y;
        private int radius;
        private float xDelta;
        private float yDelta;

        // Constructor
        public Ball(float x, float y, int radius, float xDelta, float yDelta) {
            this.x = x;
            this.y = y;
            this.radius = radius;
            this.xDelta = xDelta;
            this.yDelta = yDelta;
        }

        // Getters
        public float getX() {
            return x;
        }

        public float getY() {
            return y;
        }

        public int getRadius() {
            return radius;
        }

        public float getXDelta() {
            return xDelta;
        }

        public float getYDelta() {
            return yDelta;
        }

        // Setters
        public void setX(float x) {
            this.x = x;
        }

        public void setY(float y) {
            this.y = y;
        }

        public void setRadius(int radius) {
            this.radius = radius;
        }

        public void setXDelta(float xDelta) {
            this.xDelta = xDelta;
        }

        public void setYDelta(float yDelta) {
            this.yDelta = yDelta;
        }

        // Move the ball
        public void move() {
            x += xDelta;
            y += yDelta;
        }

        // Reflect the ball horizontally
        public void reflectHorizontal() {
            xDelta = -xDelta;
        }

        // Reflect the ball vertically
        public void reflectVertical() {
            yDelta = -yDelta;
        }

        // Convert to string format
        @Override
        public String toString() {
            return String.format("Ball[(%.1f,%.1f),speed=(%.1f,%.1f)]", x, y, xDelta, yDelta);
        }
    }



