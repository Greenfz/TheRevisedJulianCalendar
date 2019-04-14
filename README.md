# [2019-03-13] Challenge #376 [Intermediate] The Revised Julian Calendar
Background

The Revised Julian Calendar is a calendar system very similar to the familiar Gregorian Calendar, but slightly more accurate in terms of average year length. The Revised Julian Calendar has a leap day on Feb 29th of leap years as follows:

    Years that are evenly divisible by 4 are leap years.

    Exception: Years that are evenly divisible by 100 are not leap years.

    Exception to the exception: Years for which the remainder when divided by 900 is either 200 or 600 are leap years.

For instance, 2000 is an exception to the exception: the remainder when dividing 2000 by 900 is 200. So 2000 is a leap year in the Revised Julian Calendar.
Challenge

Given two positive year numbers (with the second one greater than or equal to the first), find out how many leap days (Feb 29ths) appear between Jan 1 of the first year, and Jan 1 of the second year in the Revised Julian Calendar. This is equivalent to asking how many leap years there are in the interval between the two years, including the first but excluding the second.
