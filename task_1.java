@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);

    // Дополни код здесь
    boolean expected = true;
    assertEquals("Expected isAdult to be true for age more than 18", true, isAdult);
}
