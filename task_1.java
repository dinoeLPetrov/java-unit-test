@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
    boolean expectedResult = true;
	assertEquals("Это будет выведено, если проверка не сработает", expectedResult, isAdult);// Напиши код здесь
}
