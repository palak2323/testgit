/* 3.Given an array of pairs of integers. The task is to sort the array with respect to second element of the pair.
Examples:
	
 Input: [(1, 2), (3, 5), (2, 6), (1, 7)]
	Output: [(1, 2), (3, 5), (2, 6), (1, 7)]

	Input: [(10, 20), (20, 30), (5, 6), (2, 5)]	
	Output: [(2, 5), (5, 6), (10, 20), (20, 30)]

	Definition of Done:
i.Create a class Pair and store the pairs in an array.
ii.Data members to be defined as private
iii.Public Get and set methods are defined for all the instance variables.
iv.Set methods are overloaded.
v.Two java files to be defined. One for Pair class definition and another for the application.
vi.Define a static function sort that sorts an array of pairs w.r.t the second element of the pair.*/






import java.util.*; 
  
// User defined Pair class 
class Pair { 
    int x; 
    int y; 
  
    // Constructor 
 Pair(int x, int y) 
    { 
        this.x = x; 
        this.y = y; 
    } 
} 
  
// class to define user defined conparator 
class Compare { 
  
    static void compare(Pair arr[], int n) 
    { 
        // Comparator to sort the pair according to second element 
        Arrays.sort(arr, new Comparator<Pair>() { 
            @Override public int compare(Pair p1, Pair p2) 
            { 
                return p1.y - p2.y; 
            } 
        }); 
  
        for (int i = 0; i < n; i++) { 
            System.out.print(arr[i].x + " " + arr[i].y + " "); 
        } 
        System.out.println(); 
    } 
} 
  
// Driver class 
class GFG { 
  
    // Driver code 
public static void main(String args[]) 
    { 
        Scanner sc = new Scanner(System.in); 
  
        // length of array 
        int n = 5; 
  
        // Array of Pair 
        Pair arr[] = new Pair[n]; 
  
        arr[0] = new Pair(10, 20); 
        arr[1] = new Pair(1, 2); 
        arr[2] = new Pair(3, 1); 
        arr[3] = new Pair(10, 8); 
        arr[4] = new Pair(4, 3); 
  
        Compare obj = new Compare(); 
  
        obj.compare(arr, n); 
    } 
} 