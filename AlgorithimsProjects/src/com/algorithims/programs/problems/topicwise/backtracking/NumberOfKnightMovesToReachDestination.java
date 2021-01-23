package com.algorithims.programs.problems.topicwise.backtracking;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfKnightMovesToReachDestination {

	final static int[] xMove = {-2, -1, 1, 2, -2, -1, 1, 2};
	final static int[] yMove = {-1, -2, -2, -1, 1, 2, 2, 1};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 6;
	    int knightPos[] = {4, 5};
	    int targetPos[] = {1, 1};
	   int x = knightMoves(knightPos,targetPos,N);
	   System.out.println(x);
	}
	
	public static int knightMoves(int[] src,int[] target,int l) {
		boolean[][] visited = new boolean[l][l];
		for(int i = 0;i<l;i++) {
			for(int j = 0;j<l;j++)
				visited[i][j] = false;
		}
		
		// BFS 
		Queue<KNight> queue = new LinkedList<KNight>();
 		// Source of Knight 
		KNight source = new KNight(src[0], src[1],0);
		queue.add(source);
		while(!queue.isEmpty()) {
			
			KNight tSrc = queue.poll();
			System.out.println(tSrc);
			visited[tSrc.x][tSrc.y] = true;
			
			if(tSrc.x == target[0] && tSrc.y == target[0]) {
				return tSrc.distance;
			}
			
			for(int i=0;i<l;i++) {
				int x = tSrc.x + xMove[i];
				int y = tSrc.y + yMove[i];
				if(isValid(x,y) && !visited[x][y]) {
					queue.add(new KNight(x,y,tSrc.distance +1));
				}
			}
			
		}
		
		return 0;
	}
	
	private static boolean isValid(int x , int y) {
		if(x>=0 && x < 6 && y >= 0 && y< 6) 
			return true;
		
		return false;
	}

}
class KNight{
	
	int x;
	int y;
	int distance ;
	
	public KNight(int x ,int y,int distance) {
		this.x = x;
		this.y = y;
		this.distance = distance;
	}
	
	@Override
	public String toString() {
		return "KNight [x=" + x + ", y=" + y + ", distance=" + distance + "]";
	}

	
}