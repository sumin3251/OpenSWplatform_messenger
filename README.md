# 연락혀: 어르신들을 위한 특별한 메신저
스마트폰 메신저앱 사용에 불편을 느껴 사회로 부터 소외감을 느끼시는 어르신들을 위해 최적화된 메신저 앱

## 앱설명
* 노인분들이 쉽게 어플의 기능들을 모두 활용하여 의사소통할 수 있도록 특성화된 메신저 어플이다. 

## API & 대표 기능
1) STT (speech to text)
  화면 속의 작은 키보드로 텍스트를 작성하기 어려운 어르신들을 위해 음성을 텍스트로 바꿔주는 기능을 통해 쉽게 메시지 보내기를 가능하도록 하였다.  
2) TTS (text to speech)
  메시지를 받았을 때 텍스트가 작아서 읽기 불편하신 어르신들을 위해 텍스트를 음성으로 바꿔주는 기능을 통해 쉽게 메시지를 읽을 수 있도록 하였다.
3) Seismic (shake detection)
  위급상황 시 스마트 폰을 흔들게 되면 등록된 보호자(연락처)로 알림 메세지가 자동으로 전송되는 기능을 통해 어르신의 안전에 도움음 주도록 하였다.

## 개발자 정보

* 1615011 김지민 : @jeemin97world / 중간발표, UI
* 1771014 김영주 : @RLADUDWN7237 / 중간발표, UI
* 1771094 박유진 : @jinee525 / 기말발표, UI, Readme 정리
* 1771039 윤소연 : @ysy9893 / 기말발표 ,api
* 1415030 박수민 : @sumin3251 / api(TTS, Shake detection)

## 앱 사용법 (with 스크린샷)

## 주요 기능 및 관련 코드 / API 설명
1) STT (speech to text)
2) TTS (text to speech)

 3) Seismic (shake to speech)  
 
        public void hearShake() {
              while(shakeTimes < 3) {
                  shakeTimes++;
              }
              Toast.makeText(getContext(), "흔들림이 3번 감지되었습니다.", Toast.LENGTH_SHORT).show();
              if(sendEmergency == true) {
                  sendEmergency = false;
                  txtSpeechInput.setText("[보호자 알림] 2018-12-15 02:32 OOO님의 휴대폰에서 긴급 상황이 감지되었습니다.");
                  sendText();
                  txtSpeechInput.setText("");
              }
          }
          
## 라이센스 정보
  APACHE 2.0 LICENSE
아파치 2.0 라이선스는 누구나 해당 소프트웨어에서 파생된 프로그램을 제작할 수 있으며 저작권을 양도, 전송할 수 있는 라이선스 규정을 의미한다. 아파치 라이선스에 따르면 누구든 자유롭게 아파치 소프트웨어를 다운 받아 부분 혹은 전체를 개인적 혹은 상업적 목적으로 이용할 수 있으며 재배포시에는 원본 소스 코드 또는 수정한 소스 코드를 반드시 포함시켜야 하는 것은 아니고 아파치 라이선스, 버전 2.0을 포함시켜야 하며 아파치 소프트웨어 재단에 개발된 소프트웨어라는 것을 명확하게 밝혀야 한다. 
