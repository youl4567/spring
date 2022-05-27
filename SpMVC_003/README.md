# form 과 button 관계

```
<form>
	<input>
	<button type="submit">
</form>
```
* 위와 같이 form tag 에 포함된 버튼은 기본적으로 타입이 ```submit```이다.
* 버튼 타입이 ```submit```인 경우 form tag에 포함된 input 의 값을 무조건 서버로 전송하는 이벤트가 실행된다.
* 만약 버튼을 클릭했을 때 JS 코드를 사용하여 상황을 제어하고 싶으면 버튼의 타입을 ```button```으로 설정한다.
* 버튼 타입을 ```button``` 으로 설정하면 모양만 버튼이고 아무런 역할을 수행하지 못한다.

* 버튼 타입에는 ```reset``` 도 있는데 이 타입을 form tag 에 포함된 input box 데이터를 모두 제거한다.