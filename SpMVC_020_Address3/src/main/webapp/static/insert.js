document.addEventListener("DOMContentLoaded", () => {
  const board_table = document.querySelector("table#addrList");

  /*
      이벤트 버블링을 역 이용한 이벤트 처리
      table tag 에 click event 를 설정하고
      매개변수(e)를 받는다
      이 매개변수는 클릭된 요소들에 대한 정보를 가지고 있다.
      매개변수의 속성들 중에 target 속성은
      가장 안쪽에 위치한 클릭된 tag 에 대한 정보를 가지고 있다.
      만약 클릭된 태그가 td라면 자신(td)를 감싸고 있는 가장 가까운 곳의
      tr tag 정보를 요청한다.
      그리고 tr tag 에서 data-isbn 값을 추출한다 : dataset.isbn
  */
  // if(book_table) {     }
  board_table?.addEventListener("click", (e) => {
    const td = e.target;
    if (td.tagName === "TD") {
      const tr = td.closest("TR");
      const a_seq = tr.dataset.a_seq;
      // alert(isbn)
      document.location.href = `${rootPath}/detail?seq=${a_seq}`;
    }
  });
});
