# 연락혀: 어르신들을 위한 특별한 메신저
스마트폰 메신저앱 사용에 불편을 느껴 사회로 부터 소외감을 느끼시는 어르신들을 위해 최적화된 메신저 앱

<img src="https://user-images.githubusercontent.com/43829772/50200643-18f3f980-039a-11e9-8b94-5df95df73e97.png" width="40%"></img>
<hr>

## 앱설명
* 노인분들이 쉽게 어플의 기능들을 모두 활용하여 의사소통할 수 있도록 특성화된 메신저 어플이다. 
* 플랫폼: 모바일 (어르신들이 메신저를 위한 수단으로 모바일을 가장 많이 사용한다는 실제 자료에 기반)
* 운영체제: 안드로이드 (스마트폰을 사용하는 어르신들중 약 95%이상이 안드로이드 사용한다는 실제 자료에 기반)
* 서버: Tinode 
* 아이디, 비밀번호, 이메일 등으로 가입하고 로그인하여 이용한다.
* 아이디, 이메일을 검색하여 친구를 찾아 추가, 대화를 할 수 있다.
* 주요 기능 : 1. 음성을 텍스트로 변환 2. 위급상황시 핸드폰 흔들면 보호자에게 위급 상황 알리는 메세지 발신 3. 노인분들께 최적화된 	UI

## API & 대표 기능
1) STT (speech to text)
  화면 속의 작은 키보드로 텍스트를 작성하기 어려운 어르신들을 위해 음성을 텍스트로 바꿔주는 기능을 통해 쉽게 메시지 보내기를 가능하도록 하였다.  
2) TTS (text to speech)
  메시지를 받았을 때 텍스트가 작아서 읽기 불편하신 어르신들을 위해 텍스트를 음성으로 바꿔주는 기능을 통해 쉽게 메시지를 읽을 수 있도록 하였다.
3) Seismic (shake detection)
  위급상황 시 스마트 폰을 흔들게 되면 등록된 보호자(연락처)로 알림 메세지가 자동으로 전송되는 기능을 통해 어르신의 안전에 도움음 주도록 하였다.

## 개발자 정보

* 1615011 김지민 : @jeemin97world / 중간발표(중반-후반), UI (로그인창, 로고 및 배경화면 디자인), 데이터베이스 연결
* 1771014 김영주 : @RLADUDWN7237 / 중간발표(초반-중반), UI (친구목록, 로딩 화면), 안드로이드에 빌드
* 1771094 박유진 : @jinee525 / UI, Readme 정리, 기말발표, UI(대화창, 로고 및 텍스트 변환 등 전체적 UI 담당00)
* 1771039 윤소연 : @ysy9893 / 코드 분석(STT,Shake Detection, AndroidManifest.xml 등), tts 코드 연구 및 자료 , 기말발표, 리드미 앱기능
* 1415030 박수민 : @sumin3251 / api(TTS, Shake detection), git repository 생성 및 관리, 서버 및 데이터베이스 생성

## 앱 사용법 (with 스크린샷)
<head>
	<strong style="font-family:sans-serif;font-size:xx-large; " >Rethink 데이터베이스 구축 : </strong>
	
</head>

<pr>
	<strong style="font-family:sans-serif;font-size:xx-large; " >cmd창에서 rethinkdb.exe 커맨드로 rethink데이터 베이스를 구축한다  </strong>
</pr>
	
	
<hr>
<img src="https://user-images.githubusercontent.com/43829772/50197534-d5de5a00-038a-11e9-9b27-28376a864b73.png" width="50%"></img>
<hr>
<head>
	<strong style="font-family:sans-serif;font-size:xx-large; " >Tinode 서버 구동 :  </strong>
	
</head>
<pr>
	<strong style="font-family:sans-serif;font-size:xx-large; " >cmd창에서 init-db.exe -data=data.json 와 tinode.exe 커맨드로 서버를 구동시킨다 </strong>
</pr>
<img src="https://user-images.githubusercontent.com/43829772/50197665-7fbde680-038b-11e9-9801-87a308bfcf42.png" width="50%"></img>
<hr>

</head>

<strong style="font-family:sans-serif;font-size:xx-large; " >앱 실행과정</strong>
	
</head>

</head>

<strong style="font-family:sans-serif;font-size:xx-large; " >1. 로그인창 : </strong>
	
</head>

<pr>
	<strong style="font-family:sans-serif;font-size:xx-large; " >앱을 실행면 로딩창과 로그인 창이 뜬다 </strong>
</pr>

<img src="https://user-images.githubusercontent.com/43829772/50199240-235ec500-0393-11e9-8175-168861116102.jpg" width="70%"></img>
<hr>
</head>

<strong style="font-family:sans-serif;font-size:xx-large; " >2. 친구목록 및 대화창 : </strong>
	
</head>

<pr>
	<strong style="font-family:sans-serif;font-size:xx-large; " >로그인을 하면 자신이 기존에 추가한 친구들의 목록과 대화 목록이 뜬다 </strong>
</pr>
<img src="https://user-images.githubusercontent.com/43829772/50199288-5012dc80-0393-11e9-943b-692068950e34.jpg" width="70%"></img>
<hr>

</head>

<strong style="font-family:sans-serif;font-size:xx-large; " >3.STT서비스 : </strong>
	
</head>

<pr>
	<strong style="font-family:sans-serif;font-size:xx-large; " >STT서비스로 음성인식을 통해 음성을 텍스트로 변환 </strong>
</pr>

<img src="https://user-images.githubusercontent.com/43829772/50199289-54d79080-0393-11e9-94f1-1048accfdc02.jpg" width="70%"></img>
<hr>

</head>

<strong style="font-family:sans-serif;font-size:xx-large; " >4. Shake Detection: </strong>
	
</head>

<pr>
	<strong style="font-family:sans-serif;font-size:xx-large; " >반복된 흔들림을 감지하여 보호자에게 위급상황 알림 </strong>
</pr>

<img src="https://user-images.githubusercontent.com/43829772/50199291-57d28100-0393-11e9-8f03-173740d915f2.jpg" width="40%"></img>
<hr>

## 웹 사용 (스크린 샷)

<img src="https://user-images.githubusercontent.com/43829772/50200697-5e182b80-039a-11e9-9013-1ae29c979c06.png" width="40%"></img>
<hr>






## 주요 기능 및 관련 코드 / API 설명
1) STT (speech to text)
  사용자에게서 인식해온 음성을 makeText 함수로 넘겨 음성을 텍스트로 변환한다.

       public void onClick(DialogInterface dialog, int which) {
               try {
                    mTopic.delete().thenApply(new PromisedReply.SuccessListener<ServerMessage>()
                        public PromisedReply<ServerMessage> onSuccess(ServerMessage result) {
                            Intent intent = new Intent(getActivity(), ContactsActivity.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                            startActivity(intent);
                            getActivity().finish();
                            return null;
                        }
                    }, mFailureListener);
                } catch (NotConnectedException ignored) {
                    Toast.makeText(activity, R.string.no_connection, Toast.LENGTH_SHORT).show();
                } catch (Exception ignored) {
                    Toast.makeText(activity, R.string.action_failed, Toast.LENGTH_SHORT).show();
                }
       }
  

2) Seismic (shake to speech)  
   shakeTimes을 변수로 설정하여 사용자가 기기를 3번 이상 흔들 경우 sendEmergency를 참으로 바꿔 알림 메세지를 보낸다.
 
        public void hearShake() {
              while(shakeTimes < 3) {        
                  shakeTimes++;
              }
              Toast.makeText(getContext(), "흔들림이 3번 감지되었습니다.", Toast.LENGTH_SHORT).show();     
              if(sendEmergency == true) {
                  sendEmergency = false;
                  txtSpeechInput.setText("[보호자 알림] 2018-12-15 02:32 OOO님의 휴대폰에서 긴급 상황이 감지되었습니다.");
                            // 등록된 보호자에게 긴급 상황 메세지 발신
                  sendText();
                  txtSpeechInput.setText("");
              }
          }
          
## 라이센스 정보
  APACHE 2.0 LICENSE
아파치 2.0 라이선스는 누구나 해당 소프트웨어에서 파생된 프로그램을 제작할 수 있으며 저작권을 양도, 전송할 수 있는 라이선스 규정을 의미한다. 아파치 라이선스에 따르면 누구든 자유롭게 아파치 소프트웨어를 다운 받아 부분 혹은 전체를 개인적 혹은 상업적 목적으로 이용할 수 있으며 재배포시에는 원본 소스 코드 또는 수정한 소스 코드를 반드시 포함시켜야 하는 것은 아니고 아파치 라이선스, 버전 2.0을 포함시켜야 하며 아파치 소프트웨어 재단에 개발된 소프트웨어라는 것을 명확하게 밝혀야 한다. 
