package fr.uvsq.refcardjava.base;

import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * La classe <code>ControlTest</code> ...
 *
 * @author hal
 * @version 2020
 */
public class ControlTest {
  @Test
  public void conditionalStatementsTest() {
    var aVariable = 0;
    // tag::if-stat[]
    if (aVariable == 0) { //<1>
      //<2>
      assert aVariable == 0;
    } else {
      //<3>
      assert aVariable != 0;
    }
    // end::if-stat[]

    // tag::switch-stat[]
    switch (aVariable) { //<1>
      case 1:
        //<2>
        assert aVariable == 1;
        break;
      case 2:
        //<3>
        assert aVariable == 2;
        break;
      default:
        //<4>
        assert aVariable != 1 && aVariable != 2;
    }
    // end::switch-stat[]
  }

  @Test
  public void whileStatementsTest() {
    // tag::while-stat[]
    var count = 1;
    while (count < 11) { //<1>
      //<2>
      count++;
    }
    assert count == 11;
    do {
      //<3>
      count++;
    } while (count < 11); //<4>
    assert count == 12;
    // end::while-stat[]
  }

  @Test
  public void forStatementsTest() {
    // tag::for-stat[]
    var numbers = List.of(1, 2, 3, 4);
    for (var number: numbers) { //<1>
      //<2>
    }

    for (int i = 1; i < 11; i++) { //<3>
      //<4>
    }
    // end::for-stat[]
  }
}
