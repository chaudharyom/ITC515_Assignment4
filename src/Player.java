package ITC515_Assignment4

public class Player {

    private String name;
    private int balance;
    private int limit;

    // constructor
    public Player(String name, int balance) {
        // check if the player's name is empty
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        // check if the balance is greater or equal to 0
        if (balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        }
        this.name = name;
        this.balance = balance;
        this.limit = 0;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        if (limit < 0) {
            throw new IllegalArgumentException("Limit cannot be negative.");
        }
        if (limit > balance) {
            throw new IllegalArgumentException("Limit cannot be greater than balance.");
        }
        this.limit = limit;
    }

    public boolean balanceExceedsLimit() {
        return (balance > limit);
    }

    // TODO: BUG
    // fix the bug of not reaching the betting limit
    public boolean balanceExceedsLimitBy(int amount) {
        return (balance - amount >= limit);
    }

    // check if the player can place a bet
    public void takeBet(int bet) {
        if (bet < 0) {
            throw new IllegalArgumentException("Bet cannot be negative.");
        }
        if (!balanceExceedsLimitBy(bet)) {
            throw new IllegalArgumentException("Placing bet would go below limit.");
        }
        balance = balance - bet;
    }

    // calculate how much winnings the player should receive based on the matched dices number
    public void receiveWinnings(int winnings) {
        if (winnings < 0) {
            throw new IllegalArgumentException("Winnings cannot be negative.");
        }

        balance = balance + winnings + 5;
        System.out.println("balance: " + balance);

    }

    public String toString() {
        return String.format("Player: %s, Balance: %d, Limit: %d", name, balance, limit);
    }
}
