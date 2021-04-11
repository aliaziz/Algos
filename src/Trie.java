class Trie {
    char c;
    boolean isWord = false;
    Trie[] children;

    Trie(char c) {
        this.c = c;
        children = new Trie[26];
    }

    public void add(String word) {
        Trie curr = this;
        for (char c : word.toCharArray()) {
            //Check if at that index in this trie, that child exists.
            if (curr.children[c - 'a'] == null) curr.children[c - 'a'] = new Trie(c);
            curr = curr.children[c - 'a'];
        }
        curr.isWord = true;
    }

    public Trie find(String word) {
        Trie curr = this;
        for (char c : word.toCharArray()) {
            //Check if at that index in this trie, that child exists.
            if (curr.children[c - 'a'] == null || !curr.isWord) return null;
            curr = curr.children[c - 'a'];
        }
        return curr;
    }
}
