import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
	public static void main(String[] args) {
		// TODO: Task 1
		List<String> cars = new ArrayList<>(Arrays.asList("BMW", "Porsche", "Audi", "Mercedes"));
		Consumer<String> carConsumer = car -> System.out.println(car.toUpperCase());
		cars.forEach(carConsumer);
		
		// TODO: Task 2
		Supplier<String> dateTimeSupplier = () -> {
			LocalDateTime now = LocalDateTime.now();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm (EEEE) - dd MMM yyyy");
			return now.format(formatter);
		};
		System.out.println(dateTimeSupplier.get());
		
		// TODO: Task 3
		List<Integer> lengths = new ArrayList<>();
		Function<String, Integer> lengthFunction = car -> car.length();
		for (String car : cars) lengths.add(lengthFunction.apply(car));
		System.out.println(lengths);
	}
}