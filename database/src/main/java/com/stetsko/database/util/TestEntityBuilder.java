package com.stetsko.database.util;

import com.stetsko.database.entity.Administrator;
import com.stetsko.database.entity.Category;
import com.stetsko.database.entity.CategoryTranslation;
import com.stetsko.database.entity.Comment;
import com.stetsko.database.entity.CommentStatus;
import com.stetsko.database.entity.Content;
import com.stetsko.database.entity.ContentTranslation;
import com.stetsko.database.entity.ContentType;
import com.stetsko.database.entity.Editor;
import com.stetsko.database.entity.ExtraField;
import com.stetsko.database.entity.ExtraFieldType;
import com.stetsko.database.entity.Lang;
import com.stetsko.database.entity.Tag;
import com.stetsko.database.entity.User;
import com.stetsko.database.entity.UserRole;
import lombok.experimental.UtilityClass;

import java.time.LocalDateTime;
import java.util.Random;

@UtilityClass
public class TestEntityBuilder {

    public Category buildCategory() {
        return Category.builder()
                .alias("someAlias")
                .created(LocalDateTime.now())
                .active(true)
                .build();
    }

    public CategoryTranslation buildCategoryTranslation(Lang lang) {
        return CategoryTranslation.builder()
                .id(CategoryTranslation.ComplexId.builder().lang(lang).build())
                .title(lang.name() + "_TestName")
                .introText(lang.name() + "_TestIntroText")
                .metaTitle(lang.name() + "_TestTitle")
                .metaDescription(lang.name() + "_TestDescription")
                .metaKeywords(lang.name() + "_TestMetaKeywords")
                .build();
    }

    public User buildUser() {
        return User.userBuilder()
                .username("user" + getRandomInt())
                .email("user@email" + getRandomInt() + ".ru")
                .phone("+375447949471")
                .password("testPass")
                .active(true)
                .role(UserRole.USER)
                .registerDate(LocalDateTime.now())
                .birthDate(LocalDateTime.now())
                .name("TestUser")
                .surname("TestUserSurname")
                .build();
    }

    public Editor buildEditor() {
        return Editor.editorBuilder()
                .username("editor" + getRandomInt())
                .email("editor@email" + getRandomInt() + ".ru")
                .phone("+375447949471")
                .password("testPass")
                .active(true)
                .role(UserRole.EDITOR)
                .registerDate(LocalDateTime.now())
                .birthDate(LocalDateTime.now())
                .name("TestUser")
                .surname("TestUserSurname")
                .additionalInfo("Some additional info")
                .build();
    }

    public Administrator buildAdministrator() {
        return Administrator.administratorBuilder()
                .username("administrator" + getRandomInt())
                .email("administrator@email" + getRandomInt() + ".ru")
                .phone("+375447949471")
                .password("testPass")
                .active(true)
                .role(UserRole.ADMINISTRATOR)
                .registerDate(LocalDateTime.now())
                .birthDate(LocalDateTime.now())
                .name("TestUser")
                .surname("TestUserSurname")
                .additionalInfo("Some additioanl info")
                .build();
    }

    public Comment buildComment() {
        return Comment.builder()
                .created(LocalDateTime.now())
                .fullText("TestFullText")
                .commentStatus(CommentStatus.PUBLISHED)
                .build();
    }

    public Content buildContent() {
        return Content.builder()
                .alias("TestContentAlias")
                .created(LocalDateTime.now())
                .lastModified(LocalDateTime.now())
                .publishUp(LocalDateTime.now())
                .publishDown(LocalDateTime.now())
                .hits(100)
                .active(true)
                .extraFields("")
                .build();
    }

    public ContentTranslation buildContentTranslation(Lang lang) {
        return ContentTranslation.builder()
                .id(ContentTranslation.ComplexId.builder().lang(lang).build())
                .title("TestContentName")
                .introText("TestIntroText")
                .fullText("TestFullText")
                .metaTitle("TestMetaTitle")
                .metaDescription("TestMetaDescription")
                .metaKeywords("TestMetaKeywords")
                .build();
    }

    public ContentType buildContentType() {
        return ContentType.builder()
                .name("TestContentType")
                .active(true)
                .build();
    }

    public ExtraField buildExtraField() {
        return ExtraField.builder().build();
    }

    public ExtraFieldType buildExtraFieldType() {
        return ExtraFieldType.builder()
                .name("TestExtraFieldType")
                .metadata("TestMetaData")
                .build();
    }

    public Tag buildTag(Lang lang) {
        return Tag.builder()
                .lang(lang)
                .value("EN_testTeg")
                .build();
    }

    private static int getRandomInt() {
        return new Random().nextInt(1000000);
    }
}