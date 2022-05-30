document.addEventListener("DOMContentloaded", () => {
  /*
    이 코드의 목적은 nav 의 li tag 를 클랙했을 때 할 일을 지정하는 것이다
    화면에 li tag 가 여러개가 있다. 여러개의 li 태그에 클릭 이벤트를 설정하려면
    documetn.querySelectorAll() 함수를 사용하여 전체 태그 리스트를 배열로 받고
    for() 반복문을 사용하여 각각의 요소에 이벤트를 부여하는 코드가 필요하다

    지금은 li 태그를 감싸고 있는 nav 태그 한 개에만 클릭 이벤트를 적용하여
    event bubbling 을 역으로 활용하여 사용한다.
    nav.main_nav 에 click event 를 설정했지만
    e 매개변수의 target 속성을 사용하면 가장 안쪽의 li 태그에 접근이 가능하다.
    li 태그가 클릭되면 tagName 을 조회해보고 실제로 li 태그가 클릭된 것이면
    li 태그의 text를 가져와서 Location 을 변경하는 용도로 활용한다.

    e.target.tagName 을 참조할때는 tag 이름을 대문자로 확인해야 한다.
     */
  const main_nav = document.querySelector("nav.main_nav");

  if (main_nav) {
    main_nav.addEventListener("click", (e) => {
      // 실제 이벤ㅌ트가 설정된 tag, nav tag
      const li = e.target;
      // 가장 안쪽에서 실제 클릭된 tag, li tag
      if (li.tagName === "LI") {
        const text = li.innerText;

        let url = `${rootPath}`;
        if (text === "로그인") {
          url += "/user/login";
        } else if (text === "회원가입") {
          url += "/user/join";
        } else if (text === "로그아웃") {
          url += "/user/logout";
        }
        document.location.href = url;
      }
    });
  }
});
