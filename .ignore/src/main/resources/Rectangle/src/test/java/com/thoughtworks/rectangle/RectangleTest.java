package com.thoughtworks.rectangle;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RectangleTest {
   
    @Test
    void shouldReturnAreaWhenLengthAndBreadthIsPositive() {
            Rectangle rectangle = new Rectangle(10.5, 4.1);
            double area = rectangle.area();
            assertThat(area, is(closeTo(43.05,0.001)));
    }
    @Test
    void shouldReturnPerimeterWhenLengthAndBreadthIsPositive() {
            Rectangle rectangle = new Rectangle(10.5, 4.1);
            double perimeter = rectangle.perimeter();
            assertThat(perimeter, is(closeTo(29.2,0.001)));
    }


}
