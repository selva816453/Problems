class Smallest window containing 0, 1 and 2{
     public int smallestSubstring(String s) {
        int[] count = new int[3]; // for '0','1','2'
        int left = 0, minLen = Integer.MAX_VALUE, unique = 0;

        for (int right = 0; right < s.length(); right++) {
            int r = s.charAt(right) - '0';
            
            if (count[r] == 0) unique++;
            count[r]++;

            while (unique == 3) {
                minLen = Math.min(minLen, right - left + 1);

                int l = s.charAt(left) - '0';
                count[l]--;
                if (count[l] == 0) unique--;

                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? -1 : minLen;
    }
}