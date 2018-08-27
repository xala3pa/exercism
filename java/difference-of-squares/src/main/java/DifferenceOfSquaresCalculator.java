import java.util.stream.IntStream;

class DifferenceOfSquaresCalculator {

  private static final int EXPONENT = 2;
  private static final int START_INCLUSIVE = 1;

  int computeSquareOfSumTo(int input) {
    return getPowNumber(getRange(input).sum());
  }

  int computeSumOfSquaresTo(int input) {
    return getRange(input)
      .map(this::getPowNumber)
      .sum();
  }

  private IntStream getRange(int input) {
    return IntStream.rangeClosed(START_INCLUSIVE, input);
  }

  private int getPowNumber(double number) {
    return (int) Math.pow(number, EXPONENT);
  }

  int computeDifferenceOfSquares(int input) {
    return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
  }
}
