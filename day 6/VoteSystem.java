// .Custom Exception Handling
 
// #Problem Statement:
// In a VOTE system, a user applying for a VoterID must meet the age eligibility criteria:
 
// The age must be above or equal to 18 years.
// If the user is below 18, throw an InvalidToVoteException
// With a proper message and if the user is valid display “Welcome to Vote”.


class InvalidToVoteException extends Exception {
    public InvalidToVoteException(String message) {
        super(message);
    }
}

public class VoteSystem {
    public static void checkEligibility(int age) throws InvalidToVoteException {
        if (age < 18) {
            throw new InvalidToVoteException("not eligible");
        }
        System.out.println("ok");
    }

    public static void main(String[] args) {
        try {
            checkEligibility(16);
        } catch (InvalidToVoteException e) {
            System.out.println(e.getMessage());
        }
    }
}