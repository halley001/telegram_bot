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
                case "/recommence":
                    String message = "Hello " + firstName +" "+ lastName + " \n\n"+
                            "Welcome to IUGET's Official Telegram Bot\n\n" +
                            "/timetablesadi - Time Table Bonamoussadi\n" +
                            "/timetableberi - Time Table Bonaberi\n" +
                            "/classnumbersadi - Class Numbers Bonamoussadi\n" +
                            "/classnumberberi - Class Numbers Bonaberi\n" +
                            "/plaquette - IUGET Pamphlet\n" +
                            "/awsregister - AWS registration form\n" +
                            "/catalogue - IUGET Catalogue 2024 - 2025\n" +
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
                            "/timetablesadi\n" +
                            "/timetableberi\n\n" +
                            "Class Number\n" +
                            "/classnumbersadi\n" +
                            "/classnumberberi\n\n" +
                            "Others\n" +
                            "/plaquette\n" +
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

                case "/timetablesadi":
                    message = "TIME TABLE BONAMOUSSADI CAMPUS \n\n" +
                            "Now choose department by selecting the letter corresponding to your department\n\n" +
                            "ANGLO-SAXON PROGRAMS\n\n" +
                            "Industrial\n" +
                            "/ttsadihndindi - HND INDUSTRIAL I\n" +
                            "/ttsadihndindii - HND INDUSTRIAL II\n" +
                            "/ttsadibtech - BACHELOR OF TECHNOLOGY (B-TECH)\n" +
                            "/ttsadimoe - MASTERS OF ENGINEERING\n\n" +
                            "Commercial\n" +
                            "/ttsadihndcomi - HND COMMERCIAL I\n" +
                            "/ttsadihndcomii - HND COMMERCIAL II\n" +
                            "/ttsadiprofbatch - PROFESSIONAL BATCHELOR\n" +
                            "/ttsadimbauob - MBA UNIVERSITY OF BAMENDA\n\n" +
                            "Health\n" +
                            "/ttsadihndhlthi - HND HEALTH I\n" +
                            "/ttsadihndhlthii - HND HEALTH II\n" +
                            "/ttsadihndhlthiii - HND HEALTH III\n" +
                            "/ttsadibatchofhlth - BACHELOR OF HEALTH\n" +
                            "/ttsadibatchofhlthspecail - SPECIAL BATCHELOR OF HEALTH\n" +
                            "/ttsadimasofhlth - MASTERS OF HEALTH\n\n" +
                            "/ttsadigimpaghana - GIMPA GHANA\n" +
                            "/ttsadimba - MBA\n" +
                            "/ttsadibusadmin - BUSINESS ADMINISTRATION\n" +
                            "/ttsadistcleuof - ST CLEMENT UNIVERSITY OF FRANCE\n" +
                            "/ttsadiexemba - EXECUTIVE MBA\n" +
                            "/ttsadidocobm - DOCTORATE OF BUSINESS MANAGEMENT\n\n\n" +
                            "LES PROGRAMMES DE FORMATION EN FRANCIAS\n\n" +
                            "Gestion\n" +
                            "/ttsadibtsges - BTS GESTION I\n" +
                            "/ttsadigeslicencepro - LICENCE PROFESSIONNELL\n" +
                            "/ttsadigesmasterpro - MASTER PROFESSIONNELL\n\n" +
                            "Industriel\n" +
                            "/ttsadibtsind - BTS INDUSTRIEL I\n" +
                            "/ttsadibtsind - BTS INDUSTRIEL II\n" +
                            "/ttsadiindlicencepro - LICENCE PROFESSIONNELL\n" +
                            "/ttsadiindlicencetech - LICENCE DE TECHNOLOGIE\n" +
                            "/ttsadiindmaspro - MASTER PROFESSIONNELLE\n\n" +
                            "Sante\n" +
                            "/ttsadibtssantei - BTS SANTE I\n" +
                            "/ttsadibtssanteii - BTS SANTE II\n" +
                            "/ttsadibtssanteiii - BTS SANTE III\n" +
                            "/ttsadisantelipro - LICENCE PROFESIONELLE\n" +
                            "/ttsadisantelispecial - LICENCE SPECIAL\n" +
                            "/ttsadisantemaspro - MASTER PROFESSIONNELLE\n\n" +
                            "/ttsadisantecyceng - CYCLE ENGINIEUR\n" +
                            "";

                    SendMessage responseTimetablesadi= new SendMessage();
                    responseTimetablesadi.setChatId(chat_id);
                    responseTimetablesadi.setText(message);
                    try{
                        execute(responseTimetablesadi);
                    }catch(TelegramApiException e){
                        e.printStackTrace();
                    }

                    break;

                case "/timetableberi":
                    message = "TIME TABLE BONABERI CAMPUS \n\n" +
                            "Now choose department by selecting the letter corresponding to your department\n\n" +
                            "ANGLO-SAXON PROGRAMS\n\n" +
                            "Industrial\n" +
                            "/ttberihndindi - HND INDUSTRIAL I\n" +
                            "/ttberihndindii - HND INDUSTRIAL II\n" +
                            "/ttberibtech - BACHELOR OF TECHNOLOGY (B-TECH)\n" +
                            "/ttberimoe - MASTERS OF ENGINEERING\n\n" +
                            "Commercial\n" +
                            "/ttberihndcomi - HND COMMERCIAL I\n" +
                            "/ttberihndcomii - HND COMMERCIAL II\n" +
                            "/ttberiprofbatch - PROFESSIONAL BATCHELOR\n" +
                            "/ttberimbauob - MBA UNIVERSITY OF BAMENDA\n\n" +
                            "Health\n" +
                            "/ttberihndhlthi - HND HEALTH I\n" +
                            "/ttberihndhlthii - HND HEALTH II\n" +
                            "/ttberihndhlthiii - HND HEALTH III\n" +
                            "/ttberibatchofhlth - BACHELOR OF HEALTH\n" +
                            "/ttberibatchofhlthspecail - SPECIAL BATCHELOR OF HEALTH\n" +
                            "/ttberimasofhlth - MASTERS OF HEALTH\n\n" +
                            "/ttberigimpaghana - GIMPA GHANA\n" +
                            "/ttberimba - MBA\n" +
                            "/ttberibusadmin - BUSINESS ADMINISTRATION\n" +
                            "/ttberistcleuof - ST CLEMENT UNIVERSITY OF FRANCE\n" +
                            "/ttberiexemba - EXECUTIVE MBA\n" +
                            "/ttberidocobm - DOCTORATE OF BUSINESS MANAGEMENT\n\n\n" +
                            "LES PROGRAMMES DE FORMATION EN FRANCIAS\n\n" +
                            "Gestion\n" +
                            "/ttberibtsges - BTS GESTION I\n" +
                            "/ttberigeslicencepro - LICENCE PROFESSIONNELL\n" +
                            "/ttberigesmasterpro - MASTER PROFESSIONNELL\n\n" +
                            "Industriel\n" +
                            "/ttberibtsind - BTS INDUSTRIEL I\n" +
                            "/ttberibtsind - BTS INDUSTRIEL II\n" +
                            "/ttberiindlicencepro - LICENCE PROFESSIONNELL\n" +
                            "/ttberiindlicencetech - LICENCE DE TECHNOLOGIE\n" +
                            "/ttberiindmaspro - MASTER PROFESSIONNELLE\n\n" +
                            "Sante\n" +
                            "/ttberibtssantei - BTS SANTE I\n" +
                            "/ttberibtssanteii - BTS SANTE II\n" +
                            "/ttberibtssanteiii - BTS SANTE III\n" +
                            "/ttberisantelipro - LICENCE PROFESIONELLE\n" +
                            "/ttberisantelispecial - LICENCE SPECIAL\n" +
                            "/ttberisantemaspro - MASTER PROFESSIONNELLE\n\n" +
                            "/ttberisantecyceng - CYCLE ENGINIEUR\n" +
                            "";

                    SendMessage responseTimetableBonaberi = new SendMessage();
                    responseTimetableBonaberi.setChatId(chat_id);
                    responseTimetableBonaberi.setText(message);
                    try{
                        execute(responseTimetableBonaberi);
                    }catch(TelegramApiException e){
                        e.printStackTrace();
                    }

                    break;


                case "":
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

                case "/plaquette":
                    message = "D:\\telegram_bot\\telegram_bot\\pdf\\plaquette.pdf";
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

                    message = "D:\\telegram_bot\\telegram_bot\\pdf\\aws-inscription.pdf";
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
                    message = "D:\\telegram_bot\\telegram_bot\\pdf\\Catalogue-iuget-2024-2025.pdf";
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

                case "/ttsadibtech":
                    String txtFilePath = "D:\\telegram_bot\\telegram_bot\\photo\\ttsadibtech-22_28.jpeg";
                    File jpegFile = new File(txtFilePath);

//                SendDocument sendDocumentRequest = new SendDocument();
//                sendDocumentRequest.setChatId(chat_id);
//                sendDocumentRequest.setDocument(new InputFile(pdfFile));
//                sendDocumentRequest.setCaption("FIRST SEMESTER TIME TABLE FOR B-TECH");
                    SendPhoto sendPhotoRequest = new SendPhoto();
                    sendPhotoRequest.setChatId(chat_id);
                    sendPhotoRequest.setPhoto(new InputFile(jpegFile));
                    sendPhotoRequest.setCaption("TIME TABLE FOR BACHELOR OF TECHNOLOGY");

                    try {
                        execute(sendPhotoRequest);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                    break;


//                case "e":
//                case "E":
//                    String photoFilePath = "D:\\Java Projects\\telegram_bot\\photo\\hndii-day_commercial.jpg";
//                    File photoFile = new File(photoFilePath);
//
//                    SendPhoto sendPhotoRequest = new SendPhoto();
//                    sendPhotoRequest.setChatId(chat_id);
//                    sendPhotoRequest.setPhoto(new InputFile(photoFile));
//                    sendPhotoRequest.setCaption("TIME TABLE FOR HND II (DAY) COMMERCIAL");
//
//                    try {
//                        execute(sendPhotoRequest);
//                    } catch (TelegramApiException e) {
//                        e.printStackTrace();
//                    }
//
//                    break;


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
                    message = "Please select your specialty\n\n" +
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
                    String s =  "Option not yet available. Get /help";

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
