Method reference is a shorthand notation of a lambda expression to call a method.

Lambda expression - str -> System.out.println(str)
Method reference - System.out::println



Four types of method references
1. Method reference to an instance method of an object – object::instanceMethod
2. Method reference to a static method of a class – Class::staticMethod
3. Method reference to an instance method of an arbitrary object of a particular type – Class::instanceMethod
4. Method reference to a constructor – Class::new


------------------------------------------------------------------------------------------------
https://beginnersbook.com/2017/10/java-8-stream-collectors-class-with-examples/

Important features:
	Lambda Expression
	Default methods in the interface
	Functional Interface
	Optional
	Method references
	Date API
	Stream API
	Nashorn, JavaScript Engine

------------------------------------------------------------------------------------------------
Functional interfaces -  one abstract method. It can have a static method, default methods.
eg-  Comparable, Runnable.
 
------------------------------------------------------------------------------------------------

Function<T, R> is also a single argument function but it returns an Object

Predicate<T> is a single argument function and either it returns true or false


 
 Method references are compact, easy-to-read lambda expressions for methods that already have a name.
 
 "::"
 
 
-----------------------------------------------------------------------------------------------

Nashorn is the latest javascript engine released with java8 . Before jdk 8, the javascript engine were based on Mozilla Rhino.
 
-----------------------------------------------------------------------------------------------
Java 8 Date api :-

eg - LocalDate, LocalTime, and LocalDateTime
 
Performance :  Java 8 API's are better in term of performance than older Date and Time API's.

Standards : Java 8 Date and Time API  comply with ISO standard, meanwhile, older java 8 Date and Time API were hard to understand and poorly designed.

Thread-safe : Most frequently used java.util.Date is mutable and not thread safe. New Java 8 Date and Time API are thread-safe.

LocalDateTime, LocalDate and LocalTime are few of the latest core API classes of java 8.

----------------

Optional as a single value container which either contains the value or not (then it is called as empty).

It is used to avoid NullPointerException

------------------------------------------------------------------------------------

Type Inference means determining the Type by compiler at compile-time.

Before Java 7:- String str[] = { "Java 7", "Java 8", "Java 9" };

Java 7:- Map<String,List<Customer>> customerInfoByCity = new HashMap<>();

Java SE 8:- ToIntBiFunction<Integer,Integer> add = (a,b) -> a + b;

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


https://stackify.com/streams-guide-java-8/


map() produces a new stream after applying a function to each element of the original stream

Integer[] empIds = { 1, 2, 3 };
    
    List<Employee> employees = Stream.of(empIds)
      .map(employeeRepository::findById)
      .collect(Collectors.toList());
	  
	  
----------------------------------------------------------------------------------------

filter(); this produces a new stream that contains elements of the original stream .


 Integer[] empIds = { 1, 2, 3, 4 };
    
    List<Employee> employees = Stream.of(empIds)
      .map(employeeRepository::findById)
      .filter(e -> e != null)
      .filter(e -> e.getSalary() > 200000)
      .collect(Collectors.toList());
	  
	  
----------------------------------------------------------------------------------------

toArray - we need to get an array out of the stream, we can simply use toArray().
	  
Employee[] employees = empList.stream().toArray(Employee[]::new);

	  
----------------------------------------------------------------------------------------

findFirst() method to get the first element of Stream in Java.
 
Integer[] empIds = { 1, 2, 3, 4 };
    
    Employee employee = Stream.of(empIds)
      .map(employeeRepository::findById)
      .filter(e -> e != null)
      .filter(e -> e.getSalary() > 100000)
      .findFirst()
      .orElse(null);
	  
	
----------------------------------------------------------------------------------------  
	  
FlatMap - A stream can hold complex data structures like Stream<List<String>>. In cases like this, flatMap() helps us to flatten the data structure to simplify further operations:


List<List<String>> namesNested = Arrays.asList( 
      Arrays.asList("Jeff", "Bezos"), 
      Arrays.asList("Bill", "Gates"), 
      Arrays.asList("Mark", "Zuckerberg"));

    List<String> namesFlatStream = namesNested.stream()
      .flatMap(Collection::stream)
      .collect(Collectors.toList());
	  
	  
	  
Stream<List<String>> to a simpler Stream<String>

-------------------------------------------------------------------------------------------


All intermediate operations are lazy, so they’re not executed until a result of a processing is actually needed.	  



















