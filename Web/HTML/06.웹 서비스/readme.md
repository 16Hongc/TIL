## 웹 서버

* 클라이언트와 대칭되는 개념으로, 클라이언트의 요청(Resquest)에 따라 적절한 결과를 응답(Response)하는 역할을 함.
* 대표적으로 Apache, NGINX, IIS 등이 있음.
* 호스트 ( host ) : 네트워크 호스트. 네트워크에 연결된 컴퓨터나 전자기기를 말한다. 인터넷은 TCP/IP 프로토콜을 이용하여 통신하므로, 일반적으로 호스트란 고유한 IP주소를 갖고 있어 통신이 가능한 컴퓨터를 말한다. 
* 호스팅 서비스 ( Hosting Service ) : 인터넷 접속 서비스 제공자가 제공하는 서버 보관 서비스. 즉 운용할 서버를 임대해주는 서비스.  



## Apache HTTP Server

![image-20200910073215608](images/image-20200910073215608.png)

* 아파치 소프트웨어 재단에서 만든 웹 서버 프로그램.
* 웹 창시자 팀 버너스 리의 `NCSA HTTPd` 기반으로 만들어짐.
* 일반적으로 리눅스 환경에서 많이 사용.
* 모듈 개념으로 확장성은 높으나, 무겁다.





## 웹 서버 구축하기 (Apache)

1. 준비하기
	
   [참조 : Apache User Support](https://httpd.apache.org/docs/2.4/en/platform/windows.html)
   
   > * `Apache HTTP Server`는 단순히 소스 코드만을 제공.
    > * 바이너리 릴리스의 경우는 각 운영체제의 컴퓨터가 읽을 수 있도록 미리 기계어로 컴파일됨 (사용자 컴퓨터 운영체제와 일치해야함) 
    > * 소스 릴리즈의 경우에는 컴파일되지 않은 원시적 코드이므로, 사용자가 직접 컴파일 과정을 진행해야함.
    > * 따라서 별도의 바이너리 패키지를 이용하여 Apache Server를 설치하면 편리함.  


2. 바이너리 패키지 설치
    : Bitnami WAMP Stack : **W**indows + **A**pache + **M**ySQL(DBMS) + **P**HP(Middle Ware) 통합 설치.
		![image-20200910072124308](images/image-20200910072124308.png)


3. 방화벽 관련 사항은 Acess 허용.

4. 설치 종료 및 실행.
    : Bitnami WAMP Stack Manager Tool.
	<img src="images/image-20200910082809247.png" alt="image-20200910082809247" style="zoom: 67%;" />
	
5. 정상 구동 확인.
	<img src="images/image-20200910083419056.png" alt="image-20200910083419056" style="zoom: 67%;" />
	
	









