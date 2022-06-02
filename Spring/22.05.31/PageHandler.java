package 페이징;

public class PageHandler {

	public static void main(String[] args) {
		//여신강림 페이징
		//야옹이 작가는 210화까지 연재함
		//step 1. 페이지수 알아내기(총 카운트와 한페이징 몇개를 보여줄지가 중요)
		int total = 219; //sql에서 count
		//네이버 웹툰 기준 1페이지당 10개 게시물을 보여줄수 있다\
		//몇개의 페이지가 나올까?
		int pages = 0;
		int pageSize = 10;//1페이지에 보여줄수 있는 게시물수
		pages = total/pageSize;
		if(total%pageSize >0)
			++pages;
		System.out.println("페이지수"+pages);
		System.out.println("한페이지에 보여줄 게시물수"+pageSize);
		//step 2. 블록 알아내기
		int navigatePage = 10; //한블록에 몇페이지를 보여줄지
		int block = 0;
		block = pages/navigatePage;
		if(pages%navigatePage >0)
			++block;
		System.out.println("블록수"+block);
		
		//step 3. 현재블록 알아내기
		int pageNum = 21;//현재페이지
		int nowBlock = 0;
		nowBlock = (pageNum/navigatePage);
		if(pageNum % navigatePage > 0) {
			++nowBlock;
		}			
		System.out.println("현재블록"+nowBlock);
		
		//step 4. 마지막 블록 알아내기
		int lastBlock = 0;
		//hint : total, navigatePage, pageSize
		lastBlock = total/(navigatePage*pageSize);
		if(total%(navigatePage*pageSize) > 0) {
			++lastBlock;
		}
		System.out.println("마지막블록"+lastBlock);
		
		//step 5. 현재내가 위치한 블록의 처음페이지와 마지막페이지 구현하기
		//ex)1블록 1~10
		//	 2블록 11~20
		
		int startPage = 0;
		int lastPage = 0;
		//힌트 startPage를 먼저 구함
		startPage = (nowBlock*navigatePage)-(navigatePage-1);
		lastPage = (nowBlock*navigatePage)/(startPage)-(navigatePage-1);
		if(nowBlock == lastBlock) {
			lastPage = pages;
		}
		
		System.out.println("현재페이지"+startPage);
		System.out.println("마지막페이지"+lastPage);
		
		//step 6. 이전버튼 다음버튼 유무 판단
		boolean hasPreviousPage = true;//이전버튼
		boolean hasNextPage = true;//다음버튼
		
		if(lastBlock == 1) {
			hasPreviousPage = false;
			hasNextPage = false;
		}
		if(lastBlock > 1 && lastBlock == nowBlock) {
			hasPreviousPage = true;
			hasNextPage = false;
		}
		if(lastBlock > 1 && pageNum <= navigatePage) {
			hasPreviousPage = false;
			hasNextPage = true;
		}
		System.out.println("이전버튼이 있음??"+hasPreviousPage);
		System.out.println("다음버튼이 있음??"+hasNextPage);
	}

}
