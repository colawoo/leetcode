###########################################################################################################
# 195. Tenth Line
# Given a text file file.txt, print just the 10th line of the file.
#
# Example:
#
# Assume that file.txt has the following content:
#
# Line 1
# Line 2
# Line 3
# Line 4
# Line 5
# Line 6
# Line 7
# Line 8
# Line 9
# Line 10
#
# Your script should output the tenth line, which is:
#
# Line 10
#
# Note:
# 1. If the file contains less than 10 lines, what should you output?
# 2. There's at least three different solutions. Try to explore all possibilities.
###########################################################################################################

#!/bin/sh

# Read from the file file.txt and output the tenth line to stdout.
# solution 1
awk 'FNR == 10 {print $0}' file.txt
# or
awk 'NR == 10' file.txt
# solution 2
sed -n '10p' file.txt
#solution 3
tail -n+10 file.txt | head -1