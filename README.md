# # Втора лабораториска вежба по Софтверско инженерство



## Лабинот Азири, бр. на индекси 171092



### Control Flow Graph:

<!--- Images -->

![Control Flow Graph](/images/CFG.jpg)

<br/>

### Цикломатска комплексност
Цикломатската комплексност на овој код е 9, истата ја добив преку формулата P+1, каде што P е бројот на предикатни јазли содржани во CFG.Во случајoв P=8, па цикломатската комплексност изнесува 9.
<br/>
Исто така со формулата E-N+2 каде E - бројот на ребри , N - бројот на јазли , во случајов Е - 29, N - 22, па цикломатската комплексност изенсува: 29-22+2 = 9.
<br/>

### Тест случаи според критериумот Every Statement

```java
 @Test
    void everyStatementTest() {
        IllegalArgumentException ex;
        List<String> expectedList;
        ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(createList()));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));

        ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(createList("0", "0", "#")));
        assertTrue(ex.getMessage().contains("List length should be a perfect square"));


        expectedList = Arrays.asList("#", "#", "#", "#");
        assertEquals(expectedList, SILab2.function(createList("#", "#", "#", "#")));

        expectedList = Arrays.asList("#", "#", "2", "#", "#", "#", "2", "#", "3", "#", "2", "#", "#", "#", "2", "#");
        assertEquals(expectedList, SILab2.function(createList("#", "#","0","#", "#", "#", "0", "#", "0", "#", "0", "#", "#", "#", "0", "#")));
    }
```



### Тест случаи според критериумот Every Branch

```java
 @Test
    void everyBranchTest() {
        IllegalArgumentException ex;
        List<String> expectedList;
        ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(createList()));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));

        ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(createList("0", "0", "#")));
        assertTrue(ex.getMessage().contains("List length should be a perfect square"));

        expectedList = Arrays.asList("#", "#", "#", "#");
        assertEquals(expectedList, SILab2.function(createList("#", "#", "#", "#")));


        expectedList = Arrays.asList("0", "0", "0", "0");
        assertEquals(expectedList, SILab2.function(createList("0", "0", "0", "0")));


        expectedList = Arrays.asList("#", "#", "2", "#", "#", "#", "2", "#", "3", "#", "2", "#", "#", "#", "2", "#");
        assertEquals(expectedList, SILab2.function(createList("#", "#","0","#", "#", "#", "0", "#", "0", "#", "0", "#", "#", "#", "0", "#")));

    }
```



### Објаснување на напишаните unit tests

## Every Statement Documentation

| Test Case | list = null | list = ["0", "0", "#"] | list = ["#","#","#","#"] | list = ["#", "#","0","#", "#", "#", "0", "#", "0", "#", "0", "#', "#", "#", "0","#"] |
| :-------: | :---------: | :--------------------: | ------------------------ | :----------------------------------------------------------: |
|     1     |      *      |           *            | *                        |                              *                               |
|     2     |      *      |           *            | *                        |                              *                               |
|     3     |      *      |                        |                          |                                                              |
|     4     |             |           *            | *                        |                              *                               |
|     5     |             |           *            | *                        |                              *                               |
|     6     |             |           *            | *                        |                              *                               |
|     7     |             |           *            |                          |                                                              |
|     8     |             |                        | *                        |                              *                               |
|    9.1    |             |                        | *                        |                              *                               |
|    9.2    |             |                        | *                        |                              *                               |
|    9.3    |             |                        | *                        |                              *                               |
|    10     |             |                        | *                        |                              *                               |
|    11     |             |                        |                          |                              *                               |
|    12     |             |                        |                          |                              *                               |
|    13     |             |                        |                          |                              *                               |
|    14     |             |                        |                          |                              *                               |
|    15     |             |                        |                          |                              *                               |
|    16     |             |                        |                          |                              *                               |
|    17     |             |                        |                          |                              *                               |
|    18     |             |                        |                          |                              *                               |
|    19     |             |                        |                          |                              *                               |
|    20     |             |                        |                          |                              *                               |
|    21     |             |                        |                          |                              *                               |
|    22     |             |                        | *                        |                              *                               |
|    23     |             |                        | *                        |                              *                               |
|    24     |             |                        | *                        |                              *                               |
|    25     |      *      |           *            | *                        |                              *                               |

<br/>

<br/>

## Every Branch Documentation

|   Test Case   | list = null | list = ["0", "0", "#"] | list = ["#","#","#","#"] | list = ["0", "0","0","0"] | list = ["#", "#","0","#", "#", "#", "0", "#", "0", "#", "0", "#', "#", "#", "0","#"] |
| :-----------: | :---------: | :--------------------: | ------------------------ | ------------------------- | :----------------------------------------------------------: |
|   1, 2 - 3    |      *      |                        |                          |                           |                                                              |
|  1,2 - 4,5,6  |             |           *            | *                        | *                         |                              *                               |
|    3 - 25     |      *      |                        |                          |                           |                                                              |
|   4,5,6 - 7   |             |           *            |                          |                           |                                                              |
|  4, 5, 6 -8   |             |                        | *                        | *                         |                              *                               |
|    7 - 25     |             |           *            |                          |                           |                                                              |
|    8 - 9.1    |             |                        | *                        | *                         |                              *                               |
|   9.1 - 9.2   |             |                        | *                        | *                         |                              *                               |
|   9. 2 - 10   |             |                        | *                        | *                         |                              *                               |
|   9.2 - 24    |             |                        | *                        |                           |                                                              |
|    24 - 25    |             |                        | *                        | *                         |                                                              |
|  10 - 22, 23  |             |                        | *                        |                           |                              *                               |
|  10 - 11, 12  |             |                        |                          | *                         |                              *                               |
|  11, 12 -13   |             |                        |                          |                           |                              *                               |
|  11,12 - 17   |             |                        |                          | *                         |                                                              |
|    13 - 14    |             |                        |                          |                           |                              *                               |
|    13 - 15    |             |                        |                          |                           |                              *                               |
|    15- 16     |             |                        |                          |                           |                              *                               |
|    16- 17     |             |                        |                          |                           |                              *                               |
|    17 - 18    |             |                        |                          |                           |                              *                               |
|    17 - 19    |             |                        |                          | *                         |                              *                               |
|    18 - 19    |             |                        |                          |                           |                              *                               |
|    19 - 20    |             |                        |                          |                           |                              *                               |
|    19 - 21    |             |                        |                          | *                         |                              *                               |
|    20 - 21    |             |                        |                          |                           |                              *                               |
|   21 - 9.3    |             |                        |                          |                           |                              *                               |
|   9.3 - 9.2   |             |                        | *                        | *                         |                              *                               |
| 22 , 23 - 9.3 |             |                        | *                        |                           |                              *                               |
|    14 -17     |             |                        |                          |                           |                              *                               |

