class Solution {
    public boolean login(String[][] accounts, String username, String password) {
        for (String[] acc : accounts) {
            if (acc[0].equals(username) && acc[1].equals(password))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String[][] accounts = {{"sagar", "12345"}, {"admin", "admin123"}};
        Solution s = new Solution();

        System.out.println(s.login(accounts, "sagar", "12345")); // true
        System.out.println(s.login(accounts, "sagar", "9999"));  // false
    }
}
