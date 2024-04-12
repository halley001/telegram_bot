package org.example;


import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendDocument;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.io.File;



public class Bot extends TelegramLongPollingBot {

    public Bot() {
        super("6728265116:AAEYYvsICMJnGAqCpL_sKqAKk_dxRYW32-Y");
    }

    public void onUpdateReceived(Update update) {

        //Check weather user has sent message to bot
        if (update.hasMessage() && update.getMessage().hasText()) {
            String userInput = update.getMessage().getText();
            String firstName = update.getMessage().getFrom().getFirstName();
            String lastName = update.getMessage().getFrom().getLastName();
            String chat_id = update.getMessage().getChatId().toString();


            switch (userInput) {
                case "/start":
                    String message = "Hello " + firstName +" "+ lastName + " \n\n"+
                            "Welcome to IUGET's Official Telegram Bot\n\n" +
                            "/timetable - for your time table\n" +
                            "/classnumber - for your class number\n" +
                            "/plaque - Plaquette IUGET\n" +
                            "/awsregister - AWS registration form\n" +
                            "/catalogue - Catalogue IUGET 2024 - 2025\n" +
                            "/help - If you have difficulties";

                    SendMessage responseStart = new SendMessage();
                    responseStart.setChatId(chat_id);
                    responseStart.setText(message);

                    try{
                        execute(responseStart);
                    }catch (TelegramApiException e){
                        e.printStackTrace();
                    }

                    break;

                case "/help":
                    message = "I can help you get your time table and class number. If you're new here, " +
                            "welcome onboard. We are more than happy to /help\n\n" +
                            "Time Table\n" +
                            "/timetable\n\n" +
                            "Class Number\n" +
                            "/classnumber\n\n" +
                            "Others\n" +
                            "/plaque\n" +
                            "/awsregister\n" +
                            "/catalogue\n\n" +
                            "Please contact Admin @harts01\n";

                    SendMessage responseHelp = new SendMessage();
                    responseHelp.setChatId(chat_id);
                    responseHelp.setText(message);

                    try {
                        execute(responseHelp);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                    break;

                case "/timetable":
                    message = "TIME TABLE OPTION \n\n" +
                            "Now choose department by selecting the letter corresponding to your department\n\n" +
                            "ANGLO-SAXON PROGRAMS\n\n" +
                            "Industrial\n" +
                            "/a - HND INDUSTRIAL I\n" +
                            "/b - HND INDUSTRIAL II\n" +
                            "/c - BACHELOR OF TECHNOLOGY (B-TECH)\n" +
                            "/d - MASTERS OF ENGINEERING\n\n" +
                            "Commercial\n" +
                            "/e - HND COMMERCIAL I\n" +
                            "/f - HND COMMERCIAL II\n" +
                            "/g - PROFESSIONAL BATCHELOR\n" +
                            "/h - MBA UNIVERSITY OF BAMENDA\n\n" +
                            "Health\n" +
                            "/i - HND HEALTH I\n" +
                            "/j - HND HEALTH II\n" +
                            "/k - HND HEALTH III\n" +
                            "/l - BACHELOR OF HEALTH\n" +
                            "/m - SPECIAL BATCHELOR OF HEALTH\n" +
                            "/n - MASTERS OF HEALTH\n\n" +
                            "/o - GIMPA GHANA\n" +
                            "/p - MBA\n" +
                            "/q - BUSINESS ADMINISTRATION\n" +
                            "/r - ST CLEMENT UNIVERSITY OF FRANCE\n" +
                            "/s - EXECUTIVE MBA\n" +
                            "/t - DOCTORATE OF BUSINESS MANAGEMENT\n\n\n" +
                            "LES PROGRAMMES DE FORMATION EN FRANCIAS\n\n" +
                            "Gestion\n" +
                            "/i - BTS GESTION I\n" +
                            "/ii - BTS GESTION II\n" +
                            "/iii - LICENCE PROFESSIONNELL\n" +
                            "/iv - MASTER PROFESSIONNELL\n\n" +
                            "Industriel\n\n" +
                            "/v - BTS INDUSTRIEL I\n" +
                            "/vi - BTS INDUSTRIEL II\n" +
                            "/vii - LICENCE PROFESSIONNELL\n" +
                            "/viii - LICENCE DE TECHNOLOGIE\n" +
                            "/ix - MASTER PROFESSIONNELLE\n\n" +
                            "Sante\n\n" +
                            "/x - BTS SANTE I\n" +
                            "/xi - BTS SANTE II\n" +
                            "/xii - BTS SANTE III\n" +
                            "/xiii - LICENCE PRO\n" +
                            "/xiv - LICENCE SPECIAL\n" +
                            "/xv - MASTER PRO\n\n" +
                            "/xvi - CYCLE ENGINIEUR\n" +
                            "";

                    SendMessage responseTimetable = new SendMessage();
                    responseTimetable.setChatId(chat_id);
                    responseTimetable.setText(message);
                    try{
                        execute(responseTimetable);
                    }catch(TelegramApiException e){
                        e.printStackTrace();
                    }

                    break;


                case "/classnumber":
                    message = " Class Number Option\n\n" +
                            "Now choose department by selecting the letter corresponding to your department\n\n" +
                            "i. Industrial Level 100\n" +
                            "j. Industrial Level 200\n" +
                            "k. Bachelor of Technology (B-TECH)\n" +
                            "l. Commercial Level 100\n" +
                            "m. Commercial Level 200\n" +
                            "n. Commercial Level 300\n" +
                            "o. Nursing\n" +
                            "p. BSC";
                    SendMessage responseClassnumber = new SendMessage();
                    responseClassnumber.setChatId(chat_id);
                    responseClassnumber.setText(message);
                    try{
                        execute(responseClassnumber);
                    }catch(TelegramApiException e){
                        e.printStackTrace();
                    }

                    break;

                case "/plaque":
                    message = "D:\\Java Projects\\telegram_bot\\pdf\\plaquette.pdf";
                    File pdfFile0 = new File(message);

                    SendDocument sendDocumentRequest0 = new SendDocument();
                    sendDocumentRequest0.setChatId(chat_id);
                    sendDocumentRequest0.setDocument(new InputFile(pdfFile0));
                    sendDocumentRequest0.setCaption("PLAQUETTE D'IUGET");

                    try{
                        execute(sendDocumentRequest0);
                    }catch(TelegramApiException e){
                        e.printStackTrace();
                    }

                    break;

                case "/awsregister":

                    message = "D:\\Java Projects\\telegram_bot\\pdf\\aws-inscription.pdf";
                    File pdfFile = new File(message);

                    SendDocument sendDocumentRequest1 = new SendDocument();
                sendDocumentRequest1.setChatId(chat_id);
                sendDocumentRequest1.setDocument(new InputFile(pdfFile));
               sendDocumentRequest1.setCaption("FICHE INSCRIPTION AWS ACADEMY");

               try{
                   execute(sendDocumentRequest1);
               }catch(TelegramApiException e){
                   e.printStackTrace();
               }

                    break;

                case "/catalogue":
                    message = "D:\\Java Projects\\telegram_bot\\pdf\\Catalogue-iuget-2024-2025.pdf";
                    File pdfFile2 = new File(message);

                    SendDocument sendDocumentRequest2 = new SendDocument();
                    sendDocumentRequest2.setChatId(chat_id);
                    sendDocumentRequest2.setDocument(new InputFile(pdfFile2));
                    sendDocumentRequest2.setCaption("CATALOGUE IUGET 2024 - 2025");

                    try{
                        execute(sendDocumentRequest2);
                    }catch(TelegramApiException e){
                        e.printStackTrace();
                    }

                    break;

                case "c":
                case "C":
                    String txtFilePath = "D:\\Java Projects\\telegram_bot\\photo\\b-tech_04-07-24.jpeg";
                    File jpegFile = new File(txtFilePath);

//                SendDocument sendDocumentRequest = new SendDocument();
//                sendDocumentRequest.setChatId(chat_id);
//                sendDocumentRequest.setDocument(new InputFile(pdfFile));
//                sendDocumentRequest.setCaption("FIRST SEMESTER TIME TABLE FOR B-TECH");
                    SendPhoto sendDocumentRequest = new SendPhoto();
                    sendDocumentRequest.setChatId(chat_id);
                    sendDocumentRequest.setPhoto(new InputFile(jpegFile));
                    sendDocumentRequest.setCaption("FIRST SEMESTER TIME TABLE FOR BACHELOR OF TECHNOLOGY");

                    try {
                        execute(sendDocumentRequest);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                    break;


                case "e":
                case "E":
                    String photoFilePath = "D:\\Java Projects\\telegram_bot\\photo\\hndii-day_commercial.jpg";
                    File photoFile = new File(photoFilePath);

                    SendPhoto sendPhotoRequest = new SendPhoto();
                    sendPhotoRequest.setChatId(chat_id);
                    sendPhotoRequest.setPhoto(new InputFile(photoFile));
                    sendPhotoRequest.setCaption("TIME TABLE FOR HND II (DAY) COMMERCIAL");

                    try {
                        execute(sendPhotoRequest);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                    break;


                case "i":
                case "I": {
                    message = "Industrial Level 100 for your class number, please select your specialty\n\n" +
                            "" +
                            "SWE1 - Software Engineering Level 100\n" +
                            "NWS1 - Network and security Level 100\n" +
                            "ETC1 -  Electrotechnique\n" +
                            "BST1 - Building Science Technology Level 100\n" +
                            "WEB1 - Web-design Level 100";

                    SendMessage response = new SendMessage();
                    response.setChatId(chat_id);
                    response.setText(message);

                    try {
                        execute(response);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }
                    break;

                case "j": {
                    message = "Industrial Level 200 for your class number, please select your specialty\n\n" +
                            "" +
                            "SWE2 - Software Engineering Level 200\n" +
                            "NWS2 - Network and security Level 200\n" +
                            "ETC2 -  Electrotechnique Level 200\n" +
                            "BST2 - Building sceince Technology Level 200\n" +
                            "WEB2 - Web-design Level 200";

                    SendMessage response = new SendMessage();
                    response.setChatId(chat_id);
                    response.setText(message);

                    try {
                        execute(response);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }
                    break;


                default:
                    String s =  "Option not yet available /help";

                    SendMessage response = new SendMessage();
                    response.setChatId(chat_id);
                    response.setText(s);

                    try{
                        execute(response);
                    }catch (TelegramApiException e){
                        e.printStackTrace();

                    }

            }




        }

            }


        public String getBotUsername () {
            // TODO
            return "IUGET_bot";
        }

        @Override
        public String getBotToken () {
            // TODO
            return  "6728265116:AAEYYvsICMJnGAqCpL_sKqAKk_dxRYW32-Y";
        }


    }
