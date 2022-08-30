package com.thoughtworks.rectangle;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

public class RectangleTest {
   
    @Test
    void shouldReturnAreaWhenLengthAndBreadthIsPositive() {
            Rectangle rectangle = new Rectangle();
            int area = rectangle.area(10, 4);
            assertThat(40 ,is(equalTo(area)));
    }
    /* @Test
    void shouldReturnAreaAsZeroWhenLengthAndBreadthIsNegative() {
            Rectangle rectangle = new Rectangle();
            int area = rectangle.area(-5, -20);
            assertThat(0,is(equalTo(area)));
    } */
}
