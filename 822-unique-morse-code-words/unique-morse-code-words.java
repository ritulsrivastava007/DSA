class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        HashSet<String> set = new HashSet<>();
        for (String word : words) {
            StringBuilder morse = new StringBuilder();
            for (char ch : word.toCharArray()) {

                switch (ch) {
                    case 'a': morse.append(".-"); break;
                    case 'b': morse.append("-..."); break;
                    case 'c': morse.append("-.-."); break;
                    case 'd': morse.append("-.."); break;
                    case 'e': morse.append("."); break;
                    case 'f': morse.append("..-."); break;
                    case 'g': morse.append("--."); break;
                    case 'h': morse.append("...."); break;
                    case 'i': morse.append(".."); break;
                    case 'j': morse.append(".---"); break;
                    case 'k': morse.append("-.-"); break;
                    case 'l': morse.append(".-.."); break;
                    case 'm': morse.append("--"); break;
                    case 'n': morse.append("-."); break;
                    case 'o': morse.append("---"); break;
                    case 'p': morse.append(".--."); break;
                    case 'q': morse.append("--.-"); break;
                    case 'r': morse.append(".-."); break;
                    case 's': morse.append("..."); break;
                    case 't': morse.append("-"); break;
                    case 'u': morse.append("..-"); break;
                    case 'v': morse.append("...-"); break;
                    case 'w': morse.append(".--"); break;
                    case 'x': morse.append("-..-"); break;
                    case 'y': morse.append("-.--"); break;
                    case 'z': morse.append("--.."); break;
                }
            }
            set.add(morse.toString());
        }
        return set.size();
    }
}