package ru.job4j.chess.firuges.black;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class BishopBlackTest {
    @Test
    public void testPosition() {
        Figure figure = new BishopBlack(Cell.C1);
        Cell expected = Cell.C1;
        assertThat(figure.position(), is(expected));
    }
    @Test
    public void testCopy() {
        Figure startMove = new BishopBlack(Cell.C1);
        Cell dest = Cell.A3;
        Figure finishMove = startMove.copy(dest);
        assertThat(finishMove.position(), is(dest));
    }

    @Test
    public  void testWay() {
        Figure bishop = new BishopBlack(Cell.C1);
        Cell[] expected = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(bishop.way(Cell.G5), is(expected));
    }
}