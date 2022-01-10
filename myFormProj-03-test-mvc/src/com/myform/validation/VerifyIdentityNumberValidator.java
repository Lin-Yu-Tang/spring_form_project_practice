package com.myform.validation;

import java.util.HashMap;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;



/*
 * Taiwan (R.O.C.) ID number validator
 * the second number is belong one of the set : [1,2,8,9]
 * the weight is : 1,9,,8,7,6,5,4,3,2,1,1
 * only check the rules, length of the ID and null problem is throw out to another handler (@Size & @NotNull) 
 */
public class VerifyIdentityNumberValidator implements ConstraintValidator<VerifyIdentityNumber, String> {

	@Override
	public boolean isValid(String theId, ConstraintValidatorContext theConstraintValidatorContext) {

		String[] prefixStr = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
				"S", "T", "U", "V", "W", "X", "Y", "Z" };

		int[] secNum = { 10, 11, 12, 13, 14, 15, 16, 17, 34, 18, 19, 20, 21, 22, 35, 23, 24, 25, 26, 27, 28, 29, 32, 30,
				31, 33 };

		HashMap letterMap = new HashMap<>();

		// add key-value to the hashmap
		for (int i = 0; i < prefixStr.length; i++) {
			letterMap.put(prefixStr[i], secNum[i]);
		}

		// implement the validation logic
		boolean result = false;

		if (theId != null) {

			theId = theId.toUpperCase();

			// verify the prefix
			String prefix1 = theId.substring(0, 1);
			String prefix2 = theId.substring(1, 2);

			if (!(prefix1.matches("[A-Z]") && (prefix2.matches("[1-2]")) || prefix2.matches("[8-9]"))) {

//				System.out.println("開頭兩碼不符合條件, 回傳false");
				return result;
			} else {
				// verify the rule

				// the prefix transform to a number
				int total = 0;
				int letterNumb = (int) letterMap.get(prefix1);

				total = letterNumb / 10 + letterNumb % 10 * 9;

				// the digit summary
				int temp = 8;
				for (int i = 1; i < theId.length() - 1; i++) {

					int numb = theId.charAt(i) - '0';
					total = total + numb * temp;
					temp--;
				}

				// the last number
				int lastNumb = theId.charAt(theId.length() - 1) - '0';
				total = total + lastNumb;

				if (total % 10 != 0) {
					result = false;
				} else {
					result = true;
				}
			}

		} else {
			result = true;
//			System.out.println("身分證欄位不可為空值 ( 交由 @NotNull 處理)");
		}

//		System.out.println("身分證驗證結果 : " + result);
		return result;

	}

}
