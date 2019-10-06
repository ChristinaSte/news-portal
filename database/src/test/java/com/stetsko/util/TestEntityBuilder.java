package com.stetsko.util;

import com.stetsko.entity.Administrator;
import com.stetsko.entity.Category;
import com.stetsko.entity.CategoryTranslation;
import com.stetsko.entity.Comment;
import com.stetsko.entity.CommentStatus;
import com.stetsko.entity.Content;
import com.stetsko.entity.ContentTranslation;
import com.stetsko.entity.ContentType;
import com.stetsko.entity.Editor;
import com.stetsko.entity.ExtraField;
import com.stetsko.entity.ExtraFieldType;
import com.stetsko.entity.Lang;
import com.stetsko.entity.Tag;
import com.stetsko.entity.User;
import com.stetsko.entity.UserRole;
import lombok.experimental.UtilityClass;

import java.time.LocalDateTime;

@UtilityClass
public class TestEntityBuilder {

    public Category buildCategory(){
        return Category.builder()
                .alias("someAlias")
                .created(LocalDateTime.now())
                .active(true)
                .build();
    }

    public CategoryTranslation buildCategoryTranslation(Lang lang) {
        return CategoryTranslation.builder()
                .id(CategoryTranslation.ComplexId.builder().lang(lang).build())
                .name(lang.name() + "_TestName")
                .introText(lang.name() + "_TestIntroText")
                .metaTitle(lang.name() + "_TestTitle")
                .metaDescription(lang.name() + "_TestDescription")
                .metaKeywords(lang.name() + "_TestMetaKeywords")
                .build();
    }

    public User buildUser(){
        return User.userBuilder()
                .username("user")
                .email("user@yandex.ru")
                .phone("+375251234567")
                .password("testPass")
                .active(true)
                .role(UserRole.USER)
                .registerDate(LocalDateTime.now())
                .birthDate(LocalDateTime.now())
                .name("TestUser")
                .surname("TestUserSurname")
                .build();
    }

    public Editor buildEditor(){
        return Editor.editorBuilder()
                .username("editor")
                .email("editor@yandex.ru")
                .phone("+375259876543")
                .password("testPass")
                .active(true)
                .role(UserRole.EDITOR)
                .registerDate(LocalDateTime.now())
                .birthDate(LocalDateTime.now())
                .name("TestEditor")
                .surname("TestEditorSurname")
                .additionalInfo("Some additional test info")
                .build();
    }

    public Administrator buildAdministrator(){
        return Administrator.administratorBuilder()
                .username("administrator")
                .email("administrator@yandex.ru")
                .phone("+375337654321")
                .password("testPass")
                .active(true)
                .role(UserRole.ADMINISTRATOR)
                .registerDate(LocalDateTime.now())
                .birthDate(LocalDateTime.now())
                .name("TestAdministrator")
                .surname("TestAdministrator")
                .additionalInfo("Some additional info")
                .build();
    }

    public Comment buildComment(){
        return Comment.builder()
                .created(LocalDateTime.now())
                .fullText("TestFullText")
                .commentStatus(CommentStatus.PUBLISHED)
                .build();
    }

    public Content buildContent(){
        return Content.builder()
                .alias("TestContentAlias")
                .created(LocalDateTime.now())
                .lastModified(LocalDateTime.now())
                .publishDown(LocalDateTime.now())
                .publishDown(LocalDateTime.now())
                .hits(100)
                .active(true)
                .extraFields("")
                .build();
    }

    public ContentTranslation buildContentTranslation(Lang lang){
        return ContentTranslation.builder()
                .id(ContentTranslation.ComplexId.builder().lang(lang).build())
                .name("TestContentName")
                .introText("TestIntroText")
                .fullText("TestFullText")
                .metaTitle("TestMetaTitle")
                .metaDescription("TetMetaDescription")
                .metaKeywords("TestMeteKeywords")
                .build();
    }

    public ContentType buildContentType(){
        return ContentType.builder()
                .name("TestContentType")
                .active(true)
                .build();
    }

    public ExtraField buildExtraField(){
        return ExtraField.builder().build();
    }

    public ExtraFieldType buildExtraFieldType(){
        return ExtraFieldType.builder()
                .name("TestExtraFieldType")
                .metadata("TestMetsData")
                .build();
    }

    public Tag buildTag(Lang lang){
        return Tag.builder()
                .lang(lang)
                .value("EN_testTeg")
                .build();
    }
}