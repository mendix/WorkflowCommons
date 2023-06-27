ALTER TABLE "mendixsystem$attribute" ADD "fkc_name" VARCHAR_IGNORECASE(255) NULL;
ALTER TABLE "mendixsystem$association" ADD "parent_fkc_name" VARCHAR_IGNORECASE(255) NULL;
ALTER TABLE "mendixsystem$association" ADD "child_fkc_name" VARCHAR_IGNORECASE(255) NULL;
UPDATE "mendixsystem$version" SET "preanalysismigrationversionnumber" = '4.2.0';
