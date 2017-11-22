/*
 * Copyright (c) 2017 by Gerrit Grunwald
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package eu.hansolo.fx.charts.tools;


public class CtxBounds {
    private double x;
    private double y;
    private double maxX;
    private double maxY;
    private double width;
    private double height;


    // ******************** Constructors **************************************
    public CtxBounds() {
        this(0, 0, 0, 0);
    }
    public CtxBounds(final double WIDTH, final double HEIGHT) {
        this(0, 0, WIDTH, HEIGHT);
    }
    public CtxBounds(final double X, final double Y, final double WIDTH, final double HEIGHT) {
        x      = X;
        y      = Y;
        width  = WIDTH;
        height = HEIGHT;
        maxX   = x + width;
        maxY   = y + height;
    }


    // ******************** Methods *******************************************
    public double getX() { return x; }
    public void setX(final double X) {
        x    = X;
        maxX = x + width;
    }

    public double getY() { return y; }
    public void setY(final double Y) {
        y    = Y;
        maxY = y + height;
    }

    public double getMinX() { return x; }
    public void setMinX(final double X) { x = X; }

    public double getMaxX() { return maxX; }
    public void setMaxX(final double X) {
        maxX = X;
        width = maxX - x;
    }

    public double getMinY() { return y; }
    public void setMinY(final double Y) { y = Y; }

    public double getMaxY() { return maxY; }
    public void setMaxY(final double Y) {
        maxY   = Y;
        height = maxY - y;
    }

    public double getWidth() { return width; }
    public void setWidth(final double WIDTH) {
        width = Helper.clamp(0, Double.MAX_VALUE, WIDTH);
        maxX  = x + width;
    }

    public double getHeight() { return height; }
    public void setHeight(final double HEIGHT) {
        height = Helper.clamp(0, Double.MAX_VALUE, HEIGHT);
        maxY   = y + height;
    }
}