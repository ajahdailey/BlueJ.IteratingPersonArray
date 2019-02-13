
/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;
       public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = "";
        int counter = 0;// assume there is a `counter`
        while(counter < personArray.length) // while `counter` is less than length of array
        {// begin loop

            Person currentPerson = personArray[counter];// use `counter` to identify the `current Person` in the array
            String stringRepresentation = currentPerson.toString();// get `string Representation` of `currentPerson`
            result += stringRepresentation;// append `stringRepresentation` to `result` variable

        }// end loop
        return result;
    }

    public String forLoop() {
        String result = "";
        for (int currentIndex = 0; currentIndex< personArray.length; currentIndex++ ) {
            Person currentPerson = personArray[currentIndex];
            String stringRepresentation = currentPerson.toString();
            result += stringRepresentation;
        
        }// identify initial value
        // identify terminal condition
        // identify increment

        // use the above clauses to declare for-loop signature
        // begin loop
        // use `counter` to identify the `current Person` in the array
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable
        // end loop

        return result;
    }

    public String forEachLoop() {
        String result = "";
        for(Person currentPerson : personArray ){
            String stringRepresentation = currentPerson.toString();
            result += stringRepresentation;
        
        
        
        }
        // identify array's type
        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
        // begin loop
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable
        // end loop

        return result;
    }

    public Person[] getPersonArray() {
        return personArray;
    }
}
