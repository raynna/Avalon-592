
package com.rs.tools;

import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * @author Tyler
 *
 */
public class CoordsGenerator {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the region id.");
		while (input.hasNextLine()) {
			if (!input.hasNextInt()) {
				break;
			}
			int regionId = input.nextInt();
			int x = (regionId >> 8) << 6;
			int y = (regionId & 0xFF) << 6;
			System.out.println("Coords : " + x + ": " + y + " Region ID: " + regionId);
			System.exit(0);

		}
	}
}